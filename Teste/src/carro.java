
public class carro {
	double cc = 1.0;
	double velocidade = 0;
	double aceleracao = 10;;
	int assentos = 4;
	int rodas = 4;
	
	public void carro() {
		System.out.print("Carro criado");
	}
	
	public void acelera(){
		velocidade += aceleracao;
		System.out.printf("Velocidade atual = %f m/s \n", velocidade);
	}
	
	public void freia(){
		velocidade -= aceleracao;
		System.out.printf("Velocidade atual = %f m/s \n", velocidade);
	}
}
