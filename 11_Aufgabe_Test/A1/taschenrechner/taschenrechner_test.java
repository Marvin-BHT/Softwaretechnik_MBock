package taschenrechner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class taschenrechner_test {

	Taschenrechner c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Taschenrechner();
	}
	
	@Test
	void testDiv() {
		assertEquals(c.div(10, 5), 2);	
	}
	
	@Test
	void testDivDurchNull() {
		assertThrows(
			IllegalArgumentException.class,()-> c.div(10, 0)
			);
		
	}

}
