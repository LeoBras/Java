import static org.junit.Assert.*;

import org.junit.Test;

public class CompraParcelada_teste {

	
//	public void testParcelas(){
//		testXParcelas(1, 1000);
//		testXParcelas(2, 500 + 510);
//		testXParcelas(5, 1040.80);
//		testXParcelas(10, 1094.97);
//	}
	
	@Test
	public void test1Parcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 1, 2);	
		assertEquals(1000, cp.total(), 0.1);
	}
	@Test
	public void test2Parcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 2, 2);	
		assertEquals(1010, cp.total(), 0.1);
	}
	@Test
	public void test5Parcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 5, 2);	
		assertEquals(1040.80, cp.total(), 0.1);
	}
	@Test
	public void test10Parcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 10, 2);	
		assertEquals(1094.97, cp.total(), 0.1);
	}
}
