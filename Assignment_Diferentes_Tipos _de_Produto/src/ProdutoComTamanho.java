
public class ProdutoComTamanho extends Produto {
	double tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho){
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	public boolean equals(Object obj){
		ProdutoComTamanho prod = (ProdutoComTamanho) obj;
		if (super.equals(prod) &&
			this.tamanho == prod.tamanho)
			return true;
		
		return false;
	}
	
	public int hashCode(){
		return super.hashCode()* 100000 + (int) tamanho * 100;
	}		
}
