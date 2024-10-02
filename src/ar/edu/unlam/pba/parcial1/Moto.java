package ar.edu.unlam.pba.parcial1;

public class Moto extends Transporte{
	
	private final Integer CAPACIDAD_MAXIMA_PASAJEROS=1;
	
	public Moto(Integer kilometros) {
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
