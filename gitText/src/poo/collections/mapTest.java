package poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapTest {
	public static void main(String[] args) {
		// Map<clave, objeto>
		Map<String,Persona> myPersonaMap= new HashMap<>();
		myPersonaMap.put("p-80001", new Persona("Luis",22));
		myPersonaMap.put("p-80001", new Persona("Manuel",22));
		myPersonaMap.put("p-80002", new Persona("Juan",22));
		myPersonaMap.put("p-80003", new Persona("Antonio",23));
		myPersonaMap.put("p-80004", new Persona("Pedro",12));
		Set<String> keys= myPersonaMap.keySet();
		for(String key:keys){
			Persona p=myPersonaMap.get(key);
			p.print();
		}
		
	}
}
