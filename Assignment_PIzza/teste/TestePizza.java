import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	@Before
	public void beforeTests(){
		Pizza.resetListaIngredientes();
	}
	
//	@Test
//	public void testPizza() {
//		Pizza pz = new Pizza();
//		assertEquals(15, pz.getPreco(),0);
//		pz.adicionaIngrediente("Bacon");
//		pz.adicionaIngrediente("Mussarela");
//		pz.adicionaIngrediente("Bacon");
//		assertEquals(20, pz.getPreco(),0);
//		pz.adicionaIngrediente("Calabresa");
//		pz.adicionaIngrediente("Bacon");
//		assertEquals(20, pz.getPreco(),0);
//		pz.adicionaIngrediente("Peperoni");
//		assertEquals(23, pz.getPreco(),0);
//	}
	
	@Test
	public void testCarrinhoDeCompras(){
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		Pizza 	pz0 = new Pizza(), 
				pz1 = new Pizza(),
				pz2 = new Pizza(),
				pz3 = new Pizza();
	
		double soma;
		
		cc.adicionaPizza(pz0);
		assertEquals(15, pz0.getPreco(),0);
		soma = 0;
		assertEquals(soma, cc.totalCarrinho(),0);
		
		pz1.adicionaIngrediente("Peperoni");
		pz1.adicionaIngrediente("Bacon");
		assertEquals(15, pz1.getPreco(), 0);
		cc.adicionaPizza(pz1);
		soma += pz1.getPreco();
		assertEquals(soma, cc.totalCarrinho(),0);
		
		pz2.adicionaIngrediente("Mussarela");
		pz2.adicionaIngrediente("Brócolis");
		pz2.adicionaIngrediente("Bacon");
		assertEquals(20, pz2.getPreco(), 0);
		cc.adicionaPizza(pz2);
		soma += pz2.getPreco();
		assertEquals(soma, cc.totalCarrinho(),0);

		pz3.adicionaIngrediente("Provolone");
		pz3.adicionaIngrediente("Brócolis");
		pz3.adicionaIngrediente("Bacon");
		pz3.adicionaIngrediente("Peperoni");
		pz3.adicionaIngrediente("Mussarela");
		pz3.adicionaIngrediente("Calabresa");
		soma += pz3.getPreco();
		assertEquals(23, pz3.getPreco(), 0);
		cc.adicionaPizza(pz3);
		assertEquals(soma, cc.totalCarrinho(),0);
		
		
	}
}
