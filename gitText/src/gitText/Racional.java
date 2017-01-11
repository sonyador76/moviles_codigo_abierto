package gitText;

public class Racional implements Comparable {
	private int numerador;
	private int denominador;
	
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public int comparableTo(Object other) throws ComparationException {
		if (!(other instanceof Racional))
				throw new ComparationException("el elemento comparado debe ser un objeto de tipo Racional");
		Racional r=(Racional)other;
		if(numerador*r.getDenominador()>denominador*r.getNumerador())
			return 1;
		else if (numerador*r.getDenominador()<denominador*r.getNumerador())
			return -1;
		return 0;
	}
	@Override
	public String toString(){
		StringBuffer buffer=new StringBuffer();
		String sg=(numerador>0 && denominador >0)||(numerador<0 && denominador <0)?"+":"-";
		buffer.append(sg);
		buffer.append(Math.abs(numerador) +"/" + Math.abs(denominador));
		return buffer.toString();
		//return Math.abs(numerador) + "/" + Math.abs(denominador);
	}
	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Racional)){
			System.out.println("no es un elemento racional "+ obj.toString());
			return false;
		}
		Racional r=(Racional)obj;
		if ((this.numerador/this.denominador)==(r.numerador/r.denominador)){
			return true;
		}
		return false;
	}
	
}
