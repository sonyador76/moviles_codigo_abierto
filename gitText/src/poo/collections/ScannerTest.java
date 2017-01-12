package poo.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		float suma=0;
		try {
			Scanner sc=new Scanner(new FileInputStream("palabras2.txt"));
			//sc.useDelimiter("\\s*bla\\s*");
			while(sc.hasNext()){
				try{
					//System.out.println(sc.nextInt());
					int x=sc.nextInt();
					System.out.println("Numero: " +x);
					suma+=x;
				}catch(InputMismatchException e){
					try{//float
						//System.out.println(sc.nextInt());
						float x=sc.nextFloat();
						System.out.println("Numero float: " +x);
						suma+=x;
					}catch(InputMismatchException e2){
						//Serian letras
						String x= sc.next();
					}

				}
				
			}
			System.out.println("La suma es: " + suma);
		} catch (FileNotFoundException e) {
			System.out.println("fichero no encontrado: ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
