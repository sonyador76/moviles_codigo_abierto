package com.cice.tutorialjava.poo;

public class Estudiante extends Persona{


		private String nie;
		private String [] cursos;

	public Estudiante(String nombre, int edad, String domicilio) {
		super(nombre, edad, domicilio);
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, int edad, String nie, String ...cursos) {
		super(nombre, edad);
		this.cursos=cursos;
		//this.setCurso(curso);
		this.setNie(nie);
	
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public int getNumeroCursos(){
		return cursos.length;
	}
	
	public void addCurso(String curso){
		String[] copia=cursos;
		cursos=new String[cursos.length+1];
		int i;
		for(i=0; i<copia.length; i++){
			cursos[i]=copia[i];
		}
		cursos[copia.length]= curso;
	}
	
	public void removeCurso(String curso){
		int posicion=-1;
		String[] copia = cursos;
		cursos=new String[cursos.length-1];
		int i;
		for(i=0; i<copia.length; i++){
			if (copia[i].equals(curso)){
				posicion=i;
			}
		}
		if (posicion!=-1){
			for(i=0; i<posicion; i++){
				cursos[i]=copia[i];
			}
			for(i=posicion+1; i<copia.length; i++){
				cursos[i-1]=copia[i];
			}
			
			
			/*for(i=0; i<copia.length; i++){
				if (!(copia[i].equals(curso))){
					cursos[i]=copia[i];
				}
			}*/
		}else{
			//No encontrado
			cursos=copia;
			System.out.println("No encontrado");
		}
		System.out.println(cadenaCurso());
		
	}
	
	public void print(){
		System.out.println("Alumno[nombre: "+ getNombre() + ", Edad: " + getEdad() + ", domicilio: " + getDomicilio() + ", NIE: " + getNie() + ", numero de cursos: " + cursos.length);
	}
	
	public String cadenaCurso(){
		String sCursos="";
		if (cursos.length!=0){
			for (int i=0; i<cursos.length;i++){
				sCursos= sCursos + cursos[i] + ", ";
			}
		}
		return sCursos;
	}
	/*public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}*/

}
