package OODFinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import IceCream.IceCream;

/*
 * The error message I receive when running this test tells me I have a null ic object
 */
class PatissierTest {
	static IceCreamFactoryPattern icfp = new OODFinal.IceCreamFactoryPattern();
	static IceCream ic;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		ic.costOfIceCream(); 
		ic.scoopIceCream("Scooping some test Ice Cream.");
		ic.serveIceCream("Here is your test Ice Cream");
		ic.getDescription();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTotalCost() {
		icfp.makeIceCream("Gelato");
		ic.costOfIceCream();
		double expected = 3.25;
		double actual = ic.costOfIceCream();
		assertEquals(expected, actual);
		fail("Not yet implemented");
		
	}

}
