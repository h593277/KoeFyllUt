package no.hvl.dat102.adt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.kjedet.KjedetKoe;

class KoeADTTest {

	private KoeADT<String> koe; 
	private String test = "Hello World";
	private String test2 = "His World";
	
	@BeforeEach
	public final void setup()
	{
		koe = new KjedetKoe<String>(); 
	}
	
	@Test
	void InnKoeTest() {
		koe.innKoe(test);
		Assertions.assertEquals(1, koe.antall());
	}
	
	@Test
	void UtKoeTest() {
		koe.innKoe(test);
		Assertions.assertEquals(test, koe.utKoe());
		koe.innKoe(test);
		koe.innKoe(test2);
		Assertions.assertEquals(test, koe.utKoe());
		Assertions.assertEquals(test2, koe.utKoe());
		
	}
	
	@Test
	void AntallTest() {
		koe.innKoe(test);
		Assertions.assertEquals(1, koe.antall());
		koe.utKoe();
		Assertions.assertEquals(0, koe.antall());
	}
	
	@Test
	void erTomTest() {
		Assertions.assertTrue(koe.erTom());
		koe.innKoe(test);
		Assertions.assertFalse(koe.erTom());
	}
	
	@Test
	void foranTest() {
		koe.innKoe(test);
		Assertions.assertEquals(test, koe.foerste());
		koe.innKoe(test2);
		Assertions.assertEquals(test, koe.foerste());
		
	}
	
	

}
