package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja gume;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		gume = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		gume = null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		gume.dodajGumu(a);
		LinkedList<AutoGuma> gumeModela = gume.pronadjiGumu("Pirelli");
		assertTrue(gumeModela.contains(a));
	}
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		AutoGuma a = null;
		gume.dodajGumu(a);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuKopija() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		gume.dodajGumu(a);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Pirelli");
		b.setPrecnik(20);
		b.setSirina(200);
		b.setVisina(50);
		gume.dodajGumu(b);
	}

	@Test
	public void testPronadjiGumuAkoPostoji() {
		boolean flag = false;
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		gume.dodajGumu(a);
		LinkedList<AutoGuma> g = gume.pronadjiGumu("Pirelli");
		for (int i = 0; i < g.size(); i++) {
			if(!g.get(i).getMarkaModel().equals("Pirelli")) {
				flag = false;
				break;
			}else flag = true;
		}
		assertTrue(flag);
	}
	@Test
	public void testPronadjiGumuAkoNePostoji() {
		boolean flag = false;
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		gume.dodajGumu(a);
		LinkedList<AutoGuma> g = gume.pronadjiGumu("Michelin");
		for (int i = 0; i < g.size(); i++) {
			if(!g.get(i).getMarkaModel().equals("Pirelli")) {
				flag = false;
				break;
			}else flag = true;
		}
		assertFalse(flag);
	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null,gume.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiViseGuma() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Pirelli");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		gume.dodajGumu(a);
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Pirelli");
		b.setPrecnik(15);
		b.setSirina(199);
		b.setVisina(42);
		gume.dodajGumu(b);
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("Michelin");
		c.setPrecnik(15);
		c.setSirina(199);
		c.setVisina(42);
		gume.dodajGumu(c);
		LinkedList<AutoGuma> g = gume.pronadjiGumu("Pirelli");
		assertEquals(2, g.size());
	}

}
