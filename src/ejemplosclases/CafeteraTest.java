package ejemplosclases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {

	@Test
	void testLlenarCafetera() {
		Cafetera cafetera=new Cafetera();
		cafetera.llenarCafetera();
	}

	@Test
	void testServirTaza() {
		Cafetera cafetera = new Cafetera ();
		int cantidadServir=500;
		cafetera.llenarCafetera();
		cafetera.servirTaza(cantidadServir);
		cafetera.servirTaza(800);
	}

	@Test
	void testVaciarCafetera() {
		Cafetera cafetera=new Cafetera();
		int vaciarCafetera=0;
		cafetera.vaciarCafetera();
		
	}

	@Test
	void testAgregarCafe() {
		Cafetera cafetera=new Cafetera();
		cafetera.vaciarCafetera();
		int cantidadAgregar=500;
		cafetera.agregarCafe(cantidadAgregar);
		cafetera.agregarCafe(800);
	}

}
