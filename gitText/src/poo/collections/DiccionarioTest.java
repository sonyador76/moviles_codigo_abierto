package poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		try {
			Diccionario d= new Diccionario("palabras.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
