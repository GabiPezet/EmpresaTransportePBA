package ar.edu.unlam.pba.parcial1;

public abstract class Persona {

	protected String nomApellido;
	protected Integer licencia;
	
	public Persona(String nomApellido, Integer licencia) {
		this.nomApellido = nomApellido;
		this.licencia = licencia;
	}
}
