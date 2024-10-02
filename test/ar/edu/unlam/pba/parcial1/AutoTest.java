package ar.edu.unlam.pba.parcial1;
import static org.junit.Assert.*;
import org.junit.Test;
public class AutoTest {

	@Test
	public void crearViajeEnAuto() {
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Boolean asignacion =vwGol.asignarChofer(chofer);
		assertTrue(asignacion);
	}
	
	@Test
	public void subirPasajerosParaViajeEnAuto() {
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Pasajero gabriel = new Pasajero("Gabriel Pezet", 36536934);
		Pasajero aldana = new Pasajero("Aldana Toranzo", 36729105);
		assertTrue(vwGol.asignarChofer(chofer));
		assertTrue(vwGol.cargarPasajeros(melany));
		assertTrue(vwGol.cargarPasajeros(gabriel));
		
		Boolean carga= vwGol.cargarPasajeros(aldana);
		assertTrue(carga);
	}
	
	@Test
	public void noSubirMasDeTresPasajeroParaViajeEnAuto() {
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Pasajero gabriel = new Pasajero("Gabriel Pezet", 36536934);
		Pasajero heber = new Pasajero("Heber Pezet", 36536935);
		Pasajero aldana = new Pasajero("Aldana Toranzo", 36729105);
		assertTrue(vwGol.asignarChofer(chofer));
		assertTrue(vwGol.cargarPasajeros(melany));
		assertTrue(vwGol.cargarPasajeros(gabriel));
		assertTrue(vwGol.cargarPasajeros(heber));
		
		Boolean carga=vwGol.cargarPasajeros(aldana);
		assertEquals(false,carga);
	}
	
	@Test
	public void cambiarChoferSinTenerPasajeros() {
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(vwGol.asignarChofer(chofer));
		
		Boolean carga=vwGol.cambiarChofer(nuevoChofer);
		assertTrue(carga);
	}

	@Test
	public void noCambiarChoferConPasajerosABordo() {
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(vwGol.asignarChofer(chofer));	
		assertTrue(vwGol.cargarPasajeros(melany));				
		
		Boolean carga=vwGol.cambiarChofer(nuevoChofer);
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
		Auto vwGol = new Auto(25000);
		Chofer chofer = new Chofer("Cesar Pezet", 20006317);
		Pasajero melany = new Pasajero("Melany Toranzo", 36729104);
		Chofer nuevoChofer = new Chofer("Tatiana Pezet", 20006317);
		assertTrue(vwGol.asignarChofer(chofer));
		assertTrue(vwGol.cargarPasajeros(melany));
		assertTrue(vwGol.despacharPasajeros(melany));
		
		Boolean carga=vwGol.cambiarChofer(nuevoChofer);
		assertEquals(true,carga);
	}
}
