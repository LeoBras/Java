import java.io.IOException;

//FabricaMecanicaDoJogo: retorna a MecanicaDoJogo que deve ser utilizada.

public class FabricaMecanicaDoJogo {
	static MecanicaDoJogo escolheMecanica(int opcao) throws IOException{
		switch (opcao) {
		
		case 6:
			return new Mecanica0(30);

		case 5:
			return new Mecanica0(20);
			
		case 4:
			return new Mecanica0(10);
			
		case 3:
			return new Mecanica1(5);
			
			
		case 2:
			return new Mecanica1(3);
					
		case 1:
		default:
			return new Mecanica1(1);
		}
	}

}
