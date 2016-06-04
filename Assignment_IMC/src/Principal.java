
public class Principal {

	public static void main(String[] args) {
		
		Paciente 	joao = new Paciente(50, 1.80),
					jose = new Paciente(50, 1.50),
					maria = new Paciente(90, 1.50);
	
	imprime("João", joao);
	imprime("José", jose);
	imprime("Maria", maria);
	
	}
	
	public static void imprime(String nome, Paciente pac){
		System.out.println(nome+":");
		System.out.println("IMC: "+pac.calcularIMC());
		System.out.println("Diagnóstico: "+pac.diagnostico());
		System.out.println(System.lineSeparator());
	}

}