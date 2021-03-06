import java.util.HashMap;
import java.util.Map.Entry;

public class CarrinhoDeCompras {

	//Produto e Quantidade
	private HashMap<Produto, Integer> listaProdutos = new HashMap<Produto,Integer>();
	
	public void adicionaProduto(Produto prod, int quantidade){
		
		if(quantidade <= 0)
			return;
		
		if(listaProdutos.containsKey(prod))
			quantidade += listaProdutos.get(prod);
		
		listaProdutos.put(prod, quantidade);	
	}
 
	
	public void removeProduto(Produto prod, int quantidade){
		
		if(!listaProdutos.containsKey(prod) || 
			quantidade < 0)
			return;
		
		quantidade = listaProdutos.get(prod) - quantidade;
		if(quantidade <= 0)
			listaProdutos.remove(prod);
		else
			listaProdutos.put(prod, quantidade);
		
	}
	
	
	public double totalCompra(){
		
		double total = 0;
		for(Entry<Produto, Integer> entry: this.listaProdutos.entrySet()) 
	        total += entry.getKey().getPreco() * entry.getValue();
		
		return total;
	}
	
	public int getNumeroProdutos(Produto p){
		if(listaProdutos.containsKey(p))
			return listaProdutos.get(p);	
			
		return -1;	
		
	}
}
