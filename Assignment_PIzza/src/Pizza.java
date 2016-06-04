import java.util.HashMap;
import java.util.Map;

public class Pizza {

	public static Map<String,Integer> listaIngredientes = new HashMap<String,Integer>();
	private int contaIngredientes = 0;
	
	
	public void adicionaIngrediente(String ingrediente){
		contaIngredientes++;
		contabilizaIngrediente(ingrediente);
	}

	public double getPreco(){
		
		int contador = getNumeroIngredientes();
		
		if (contador <= 2)
			return 15.00;
		if (contador <= 5)
			return 20.00;
		else
			return 23.00;
	}
	
	public static void contabilizaIngrediente(String ingrediente){
		
		if(listaIngredientes.containsKey(ingrediente)){
			int contador = listaIngredientes.get(ingrediente);
			listaIngredientes.put(ingrediente,++contador);
		} else {
			listaIngredientes.put(ingrediente,1);
		}
	}
	
	public int getNumeroIngredientes(){
		return contaIngredientes;
	}
	
	static void resetListaIngredientes(){
		listaIngredientes.clear();
	}
}
