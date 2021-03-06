
public class CompraParcelada extends Compra {
	private int parcelas;
	private double jurosMensal;
	
	public CompraParcelada(double total, int parcelas, double jurosMensal){
		super(total);
		this.parcelas = parcelas;
		this.jurosMensal = jurosMensal;
	}
	
	public double total(){
		double m = 1, t = 1; 
		double j = (1 + jurosMensal/100);
		
		for(int i = 1; i < parcelas; i++){
			m *= j;
			t += m;
		}
		
		return ((super.total() / parcelas) * t ); 
	}
}
