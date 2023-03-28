import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZlomekTest {

	@Test
	void testGetCitatel() {
		Zlomek z = new Zlomek(1,2);
		assertEquals(1,z.getCitatel(),"Wrong");
	}

	@Test
	void testSetCitatel() {
		Zlomek z = new Zlomek(1,2);
		assertEquals(z.setJmenovatel(1),1,"Wrong");
	}

	@Test
	void testGetJmenovatel() {
		Zlomek z = new Zlomek(1,2);
		assertEquals(1,z.getJmenovatel(),"Wrong");
	}

	@Test
	void testSetJmenovatel() {
		fail("Not yet implemented");
	}

	@Test
	void testZlomek() {
		assertEquals(Zlomek z = new Zlomek(1,2),"Wrong");
	}

	@Test
	void testScitani() {
		Zlomek z = new Zlomek(1,2);
		Zlomek z2 = new Zlomek(1,2);
		assertEquals(2/4,z.scitani(z, z2),"Wrong");
	}

	@Test
	void testOdcitani() {
		Zlomek z = new Zlomek(1,2);
		Zlomek z2 = new Zlomek(1,2);
		assertEquals(0,z.odcitani(z, z2),"Wrong");
	}

	@Test
	void testNasobeni() {
		Zlomek z = new Zlomek(1,2);
		Zlomek z2 = new Zlomek(1,2);
		assertEquals(1/4,z.nasobeni(z, z2),"Wrong");
	}

	@Test
	void testDeleni() {
		Zlomek z = new Zlomek(1,2);
		Zlomek z2 = new Zlomek(1,2);
		assertEquals(1,z.deleni(z, z2),"Wrong");
	}

	@Test
	void testToString() {
		Zlomek z = new Zlomek(1,2);
		assertEquals(z.getCitatel()+"/"+z.getJmenovatel(),z.ToString(),"Wrong");
	}

	@Test
	void testKraceni() {
		fail("Not yet implemented");
	}

	@Test
	void testNSD() {
		fail("Not yet implemented");
	}

}
