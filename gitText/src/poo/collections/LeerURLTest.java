package poo.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LeerURLTest {

	public static void main(String[] args) {
		String urlStr="http://www.mit.edu";
		try {
			URL url= new URL(urlStr);
			
			URLConnection con=url.openConnection();
			InputStream in=con.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(in));
			String line;
			int byteLeido;
			while((byteLeido=in.read())!=-1){
				System.out.println(byteLeido);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
