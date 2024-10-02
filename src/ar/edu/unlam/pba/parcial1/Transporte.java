package ar.edu.unlam.pba.parcial1;

import java.util.ArrayList;
import java.util.List;

public abstract class Transporte {
	
	protected final Integer VEHICULO_VACIO=0;
	protected Chofer chofer;
	protected List <Pasajero> pasajeros = new ArrayList<Pasajero>();
	protected Integer kilometros;
	
	public Transporte(Integer kilometros) {
		this.kilometros=kilometros;
		this.chofer=null;
	}
	
	public Boolean asignarChofer(Chofer chofer) {
		Boolean asignacion=false;
		if(this.chofer==null) {
		this.chofer=chofer;
		asignacion=true;
		} return asignacion;
	}
	
	abstract public Boolean cargarPasajeros(Pasajero pasajero);
	
	public Integer getKilometros() {
		return kilometros;
	}

	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}
	
	public Boolean cambiarChofer(Chofer nuevoChofer) {
		Boolean cambio=false;
		if(this.pasajeros.size()==VEHICULO_VACIO) {
			this.chofer=nuevoChofer;
			cambio=true;
		} return cambio;
	}
	public Boolean despacharPasajeros(Pasajero pasajero) {
		Boolean despachar=false;
		if(this.pasajeros.contains(pasajero)) {
			this.pasajeros.remove(pasajero);
			despachar=true;
		} return despachar;
	}
	
	
}
