import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CtverecTest {

	@Test
	void testGetStrana() {
		Ctverec c = new Ctverec(5);
		assertEquals(5,c.getStrana(),"Spatna strana");
	}

	@Test
	void testSetStrana() {
		fail("Not yet implemented");
	}

}
