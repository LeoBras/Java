import static org.junit.Assert.*;

import org.junit.Test;

public class Autoridade_test {
	
	@Test
	public void testInformal() {
		Informal t = new Informal();
		Autoridade a = new Autoridade("José", "Silva", t);
		assertEquals("José",a.getTratamento());
		Autoridade b = new Autoridade("Maria", "Antonieta", t);
		assertEquals("Maria",b.getTratamento());
	}
	
	@Test
	public void testRespeitoso() {
		Respeitoso t = new Respeitoso(true);
		Autoridade a = new Autoridade("José", "Silva", t);
		assertEquals("Sr. Silva",a.getTratamento());
		
		Respeitoso t1 = new Respeitoso(false);
		Autoridade b = new Autoridade("Maria", "Antonieta", t1);
		assertEquals("Sra. Antonieta",b.getTratamento());
		
	}
	
	@Test
	public void testComTitulo() {
		ComTitulo t = new ComTitulo("Magnífico");
		Autoridade a = new Autoridade("José", "Silva", t);
		assertEquals("Magnífico José Silva",a.getTratamento());
		
		ComTitulo t1 = new ComTitulo("Excelentíssima");
		Autoridade b = new Autoridade("Maria", "Antonieta", t1);
		assertEquals("Excelentíssima Maria Antonieta",b.getTratamento());
		
	}
	
	
}