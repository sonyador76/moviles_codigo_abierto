package poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import poo.collections.Persona;

public class OrdenacionPersonasTest {
/*		@Override
		public int compare(Persona o1, Persona o2){
			return o1.getEdad()-o2.getEdad();
		}*/
	public static void main(String[] args) {
		List<Persona> listaPersonas=new ArrayList<>(); 
		listaPersonas.add(new Persona ("Luis", 24));
		listaPersonas.add(new Persona ("Manuel", 22));
		listaPersonas.add(new Persona ("Jose", 34));
		listaPersonas.add(new Persona ("Juan", 28));
		listaPersonas.add(new Persona ("Lucia", 29));
		listaPersonas.add(new Persona ("Lucas", 44));
		//Collections.sort(listaPersonas, new Comparator<Persona>(){
		//Expresion LAMBDA
		Collections.sort(listaPersonas,(o1, o2)->o1.getEdad()-o2.getEdad());
		
		for(Persona p:listaPersonas){
			p.print();
		}
	}
}
