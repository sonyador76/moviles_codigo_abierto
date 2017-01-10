package com.cice.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante ("luis", 22, "22222", "Poo", "Android", "IOS");
		System.out.println(e.getNumeroCursos());
		e.addCurso("Pytton");
		System.out.println(e.getNumeroCursos());
		//e.removeCurso("Poo");
		e.removeCurso("kkk");
		System.out.println("cusos: " + e.getNumeroCursos());
		
		
	}

}
  