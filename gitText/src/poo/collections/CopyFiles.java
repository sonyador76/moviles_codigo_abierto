package poo.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fs=System.getProperty("file.separator");
		File file = new File("src"+fs+"poo"+fs+"collections"+fs+"ArrayTest.java");
		
		if (file.exists()){
			try(InputStream in=new FileInputStream(file);
				OutputStream out= new FileOutputStream("copy.txt")){
				int byteLeidos=0;
				byte[]buffer = new byte[1024];
				System.out.println("iniciando la copia de ficheros");
				/*while((byteLeido=in.read())!=-1){
					out.write(byteLeido);
				}*/
				do{
					byteLeidos=in.read(buffer);
					if (byteLeidos>0){
						out.write(buffer,0,byteLeidos);
					}
				}while(byteLeidos<buffer.length);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		

	}

}
