
public class Produto {
	private String nome;
	int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public boolean equals(Object obj){
		Produto prod = (Produto) obj;
		if (this.codigo == prod.codigo)
			return true;
		
		return false;
	}
	
	public int hashCode(){
		return codigo;
	}
	
	double getPreco(){
		return this.preco;
	}
	
	String getNome(){
		return this.nome;
	}
}
