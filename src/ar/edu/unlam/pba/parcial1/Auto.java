package ar.edu.unlam.pba.parcial1;

public class Auto extends Transporte {

	private final Integer CAPACIDAD_MAXIMA_PASAJEROS=3;		
		
	public Auto(Integer kilometros) {
		super(kilometros);
		this.kilometros = kilometros;
		this.chofer=null;
	}	
	@Override
	public Boolean cargarPasajeros(Pasajero pasajero) {
		Boolean carga=false;
		if(this.pasajeros.size()<CAPACIDAD_MAXIMA_PASAJEROS) {
			this.pasajeros.add(pasajero);
			carga=true;
		} return carga;
	}	
}
