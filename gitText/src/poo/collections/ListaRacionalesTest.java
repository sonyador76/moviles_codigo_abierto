package poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gitText.Racional;


public class ListaRacionalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStringList =new ArrayList<>();
		List<Racional> myRacionalList=new ArrayList<>();
		myStringList.add("Luis");
		myStringList.add("Luis");
		myStringList.add("Manuel");
		myStringList.add("Jose");
		myStringList.add("Alberto");
		System.out.println("recorriendo la lista con indice");
		for(int i=0; i<myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}
		System.out.println("recorriendo la lista con for each");
		for(String str:myStringList){
			System.out.println(str);
		}
		System.out.println("recorriendo la lista con iterador");
		Iterator<String> it =myStringList.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,7));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(4,6));
		System.out.println("recorriendo lista con iterador");
		Iterator<Racional> it2 = myRacionalList.iterator();
		while(it2.hasNext()){
			Racional r=it2.next();
			System.out.println(r);
		}
		
	}

}
