package ar.edu.unlam.pba.parcial1;
import static org.junit.Assert.*;
import org.junit.Test;
public class BusTest {

	@Test
	public void crearViajeEnBus() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Boolean asignacion =volvo.asignarChofer(chofer);
		assertTrue(asignacion);
	}
	
	@Test
	public void subirPasajerosParaViajeEnBus() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Pasajero gabriel = new Pasajero("Gabriel Pezet", 36536934);
		Pasajero aldana = new Pasajero("Aldana Toranzo", 36729105);
		assertTrue(volvo.asignarChofer(chofer));
		assertTrue(volvo.cargarPasajeros(melany));
		assertTrue(volvo.cargarPasajeros(gabriel));
		
		Boolean carga= volvo.cargarPasajeros(aldana);
		assertTrue(carga);
	}
	
	@Test
	public void cambiarChoferSinTenerPasajeros() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(volvo.asignarChofer(chofer));
		
		Boolean carga=volvo.cambiarChofer(nuevoChofer);
		assertTrue(carga);
	}
	
	@Test
	public void noCambiarChoferConPasajerosABordo() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(volvo.asignarChofer(chofer));
		assertTrue(volvo.cargarPasajeros(melany));				
		
		Boolean carga=volvo.cambiarChofer(nuevoChofer);
		assertEquals(false,carga);
	}
	
	@Test
	public void despacharPasajerosCorrectamente() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		assertTrue(volvo.asignarChofer(chofer));
		assertTrue(volvo.cargarPasajeros(melany));
		
		Boolean carga=volvo.despacharPasajeros(melany);
		assertEquals(true,carga);
	}
	
	@Test
	public void cambiarChoferCorrectamenteLuegoDedespacharPasajerosCorrectamente() {
		Bus volvo = new Bus(150000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(volvo.asignarChofer(chofer));
		assertTrue(volvo.cargarPasajeros(melany));
		assertTrue(volvo.despacharPasajeros(melany));
		
		Boolean carga=volvo.cambiarChofer(nuevoChofer);
		assertEquals(true,carga);
	}
}
