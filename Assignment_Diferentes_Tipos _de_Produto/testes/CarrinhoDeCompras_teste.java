import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeCompras_teste {

	CarrinhoDeCompras cc;
	Produto p1, p2;
	ProdutoComTamanho pt1, pt2;
	
	@Before 
	public void antes(){
		cc = new CarrinhoDeCompras();
		p1 = new Produto("Bola1", 1, 10.0);
		p2 = new Produto("Bola2", 2, 11.0);
		pt1 = new ProdutoComTamanho("Bola", 1, 10.0, 1);
		pt2 = new ProdutoComTamanho("Bola", 1, 10.0, 2);
	}
	
	@Test
	public void testAdicionaProduto() {
		//Adiciona um produto
		cc.adicionaProduto(p1, 5);
		assertEquals(cc.getNumeroProdutos(p1), 5);
		
		//Adiciona outro produto
		cc.adicionaProduto(p2, 3);
		assertEquals(cc.getNumeroProdutos(p2), 3);
		assertEquals(cc.getNumeroProdutos(p1), 5);// O primeiro ainda está la?
		
		// Adiciona o mesmo produto denovo.
		cc.adicionaProduto(p1, 8);
		assertEquals(cc.getNumeroProdutos(p1), 5 + 8);
		assertEquals(cc.getNumeroProdutos(p2), 3);
	}
	
	@Test
	public void testRemoveProduto() {
		
		//Adiciona um produto
		cc.adicionaProduto(p1, 15);
		cc.adicionaProduto(p2, 3);
		
		cc.removeProduto(p1, 10);
		assertEquals(cc.getNumeroProdutos(p1), 15 - 10);
		
		cc.removeProduto(p2, 2);
		assertEquals(cc.getNumeroProdutos(p2), 3 - 2);
		
		cc.removeProduto(p1, 7);
		assertFalse(cc.getNumeroProdutos(p1) > 0);
		assertTrue(cc.getNumeroProdutos(p2) > 0);
		
		cc.removeProduto(p2, 1);
		assertFalse(cc.getNumeroProdutos(p1) > 0);
	}

	@Test
	public void testAdicionaProdutoComTamanho() {
		
		cc.adicionaProduto(p1, 5);
		cc.adicionaProduto(pt1, 7);
		cc.adicionaProduto(pt2, 9);

		assertEquals(cc.getNumeroProdutos(p1), 5);
		assertEquals(cc.getNumeroProdutos(pt1), 7);
		assertEquals(cc.getNumeroProdutos(pt2), 9);	
	}

	@Test
	public void testRemoveProdutoComTamanho() {
		
		cc.adicionaProduto(p1, 5);
		cc.adicionaProduto(pt1, 7);
		cc.adicionaProduto(pt2, 9);
		
		cc.removeProduto(p1, 1);
		cc.removeProduto(pt1, 4);
		cc.removeProduto(pt2, 10);
		
		assertEquals(cc.getNumeroProdutos(p1), 5 - 1);
		assertEquals(cc.getNumeroProdutos(pt1), 7 - 4);
		assertFalse(cc.getNumeroProdutos(pt2) > 0);
		

	}
}