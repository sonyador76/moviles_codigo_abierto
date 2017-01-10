package com.cice.tutorialjava.poo;

public class Persona {
	//Un miembro de una clase es un atributo
	private String nombre;
	private int edad;
	private String domicilio;

	public Persona(){
		
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, String domicilio) {
		setNombre(nombre);
		setEdad(edad);
		setDomicilio(domicilio);
	}
	
	//Un atributo por defecto se crea protected
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public int getEdad(){
		return this.edad;
	}
	public void setDomicilio(String domicilio){
		this.domicilio=domicilio;
	}
	public String getDomicilio(){
		return this.domicilio;
	}
	
	void print(){
		System.out.println("Persona[nombre: " + getNombre() + ", domicio: " + this.getDomicilio() + ", edad: "+ getEdad() + "]");
	}
}
