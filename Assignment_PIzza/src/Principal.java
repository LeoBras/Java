import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		Pizza pz1 = new Pizza();
		pz1.adicionaIngrediente("Frango");
		pz1.adicionaIngrediente("Catupiry");
		
		Pizza pz2 = new Pizza();
		pz2.adicionaIngrediente("Brócolis");
		pz2.adicionaIngrediente("Bacon");
		pz2.adicionaIngrediente("Cheddar");
		pz2.adicionaIngrediente("Muzzarela");
		
		Pizza pz3 = new Pizza();
		pz3.adicionaIngrediente("Presunto");
		pz3.adicionaIngrediente("Muzzarela");
		pz3.adicionaIngrediente("Ervilha");
		pz3.adicionaIngrediente("Milho");
		pz3.adicionaIngrediente("Bacon");
		pz3.adicionaIngrediente("Calabresa");
		
		CarrinhoDeCompras car = new CarrinhoDeCompras();
		car.adicionaPizza(pz1);
		car.adicionaPizza(pz2);
		car.adicionaPizza(pz3);
		
		System.out.println("Total carrinho: R$"+car.totalCarrinho()+"\n");
		
		imprimeIngredientesUsados();
		
	}

	static void imprimeIngredientesUsados(){
		
	    for(Entry<String, Integer> entry: Pizza.listaIngredientes.entrySet()) 
	        System.out.println("Ingrediente: "+entry.getKey()+"\t Qtd: "+entry.getValue());
	}
}