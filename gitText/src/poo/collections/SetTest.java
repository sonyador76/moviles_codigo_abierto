package poo.collections;

//import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.Set;

import gitText.Racional;

import java.util.HashSet;

//import gitText.Racional;

public class SetTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringList =new HashSet<>();
		Set<Racional> myRacionalSet =new HashSet<>();
		//List<Racional> myStringSet=new ArrayList<>();
		myStringList.add("Luis");
		myStringList.add("Luis");
		myStringList.add("Manuel");
		myStringList.add("Jose");
		myStringList.add("Alberto");
		System.out.println("recorriendo la lista con indice");
		/*for(int i=0; i<myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}*/
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
		
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,7));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(4,6));
		System.out.println("recorriendo lista con iterador");
		Iterator<Racional> it2 = myRacionalSet.iterator();
		while(it2.hasNext()){
			Racional r=it2.next();
			System.out.println(r);
		}
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Manuel").hashCode());
		
	}

}
