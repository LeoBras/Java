import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProdutoComTamanho_test {

	ProdutoComTamanho p1, p2, p3;
	
	@Before
	public void prepara(){
		p1 = new ProdutoComTamanho("Bola1", 1000, 10.0, 1);
		p2 = new ProdutoComTamanho("Bola2", 1000, 12.0, 1);
		p3 = new ProdutoComTamanho("Bola3", 1000, 10.0, 2);
	}
	
	@Test
	public void testHash() {
		assertEquals(p1.hashCode(), p2.hashCode());
		assertNotEquals(p1.hashCode(), p3.hashCode());
	}

	@Test
	public void testEquals() {
		assertTrue(p1.equals(p2));
		assertFalse(p1.equals(p3));
	}
}
