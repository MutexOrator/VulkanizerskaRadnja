package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	private AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	
	public void testSetMarkaModel() {
		a.setMarkaModel("Michelin");
		assertEquals("Michelin", a.getMarkaModel());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(14);
		assertEquals(14, a.getPrecnik());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIspodOpsega() {
		a.setPrecnik(5);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIznadOpsega() {
		a.setPrecnik(1024);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspodOpsega() {
		a.setSirina(10);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaIznadOpsega() {
		a.setSirina(1024);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspodOpsega() {
		a.setVisina(10);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznadOpsega() {
		a.setVisina(1024);;
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Pirelli, precnik=20, sirina=200, visina=50"+ "]", a.toString());
	}

	@Test
	public void testEqualsTrue() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Pirelli");
		b.setPrecnik(20);
		b.setSirina(200);
		b.setVisina(50);
		assertTrue(a.equals(b));
	}
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Michelin");
		b.setPrecnik(20);
		b.setSirina(200);
		b.setVisina(50);
		assertFalse(a.equals(b));
	}

}
