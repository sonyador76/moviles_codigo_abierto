package com.cice.tutorialjava.poo;

public class PersonaTest {

	public static void main(String[] args) {

		Persona p = new Persona();
		System.out.println("objeto persona construido");
		p.print();
		p.setNombre("Angel");
		p.setEdad(33);
		p.setDomicilio("Madrid");
		p.print();
	}

}
