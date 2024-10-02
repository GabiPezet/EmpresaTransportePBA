package ar.edu.unlam.pba.parcial1;
import static org.junit.Assert.*;
import org.junit.Test;
public class MotoTest {

	@Test
	public void crearViajeEnMoto() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Boolean asignacion =honda.asignarChofer(chofer);
		assertTrue(asignacion);
	}
	
	@Test
	public void subirPasajeroParaViajeEnMoto() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		assertTrue(honda.asignarChofer(chofer));
		
		Boolean carga=honda.cargarPasajeros(melany);
		assertTrue(carga);
	}

	@Test
	public void noSubirMasDeUnPasajeroParaViajeEnMoto() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Pasajero gabriel = new Pasajero("Gabriel Pezet", 36536934);
		assertTrue(honda.asignarChofer(chofer));
		assertTrue(honda.cargarPasajeros(melany));
		
		Boolean carga=honda.cargarPasajeros(gabriel);
		assertFalse(carga);
	}
	
	@Test
	public void cambiarChoferSinTenerPasajeros() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(honda.asignarChofer(chofer));
		
		Boolean carga=honda.cambiarChofer(nuevoChofer);
		assertTrue(carga);
	}
	
	@Test
	public void noCambiarChoferConPasajerosABordo() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(honda.asignarChofer(chofer));
		assertTrue(honda.cargarPasajeros(melany));
		
		Boolean carga=honda.cambiarChofer(nuevoChofer);
		assertEquals(false,carga);
	}
	
	@Test
	public void despacharAcompañanteCorrectamente() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		assertTrue(honda.asignarChofer(chofer));
		assertTrue(honda.cargarPasajeros(melany));
		
		Boolean carga=honda.despacharPasajeros(melany);
		assertEquals(true,carga);
	}
	
	@Test
	public void cambiarChoferCorrectamenteLuegoDedespacharAcompañanteCorrectamente() {
		Moto honda = new Moto(75000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(honda.asignarChofer(chofer));
		assertTrue(honda.cargarPasajeros(melany));
		assertTrue(honda.despacharPasajeros(melany));
		
		Boolean carga=honda.cambiarChofer(nuevoChofer);
		assertEquals(true,carga);
	}
}
