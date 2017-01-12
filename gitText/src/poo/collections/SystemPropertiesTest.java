package poo.collections;

import java.util.Properties;
import java.util.Set;

public class SystemPropertiesTest {

	public static void main(String[] args) {
				Properties sp=System.getProperties();
				Set keys=sp.keySet();
				for (Object key: keys){
					System.out.println(key + ":" +sp.get(key));
				}
	}

}
