import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestePessoa {

	private static Date now;
	private static Relogio rel;
	private static Pessoa maria, jose, joao;
	
	@BeforeClass
	public static void prepara(){
		now = new Date(2016, 06, 01);
		rel = new Relogio();
		rel.setForceValue(now.getTime());
		maria = new Pessoa(new Date(1987, 04, 03)); // Mes -1 
		jose = new Pessoa(new Date(1988, 03, 02));
		joao = new Pessoa(new Date(1989, 11, 29));
		
	}
	
	@Test
	public void testIdade() {
		assertEquals(29, maria.getIdade(rel));
		assertEquals(28, jose.getIdade(rel));
		assertEquals(26, joao.getIdade(rel));
	}
	
	@Test
	public void testSigno() {
		assertEquals("Touro",maria.getSigno());
		assertEquals("Áries",jose.getSigno());
		assertEquals("Capricornio",joao.getSigno());
	}

}
