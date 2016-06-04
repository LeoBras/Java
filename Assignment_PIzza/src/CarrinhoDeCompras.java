import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Pizza> listaPizzas = new ArrayList<Pizza>();
	
	public boolean adicionaPizza(Pizza pz){
		if(pz.getNumeroIngredientes() > 0){
			listaPizzas.add(pz);
			return true;
		} else {
			return false;
		}
	}
	
	public double totalCarrinho(){
		double total = 0;
		Pizza pz;
		for(int i = 0; i < listaPizzas.size(); i++){
			pz = listaPizzas.get(i);
			total += pz.getPreco();
		}
		return total;
	}
	
	// Acredito que era para fazer o metodo acima, mas aqui está como pedido.
	public int getContadorPizzas(){
		return listaPizzas.size();
	}
}