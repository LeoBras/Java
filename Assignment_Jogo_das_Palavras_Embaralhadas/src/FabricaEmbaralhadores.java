import java.util.Random;

//FabricaEmbaralhadores: possui um método que retorna um embaralhador aleatóriamente.

public class FabricaEmbaralhadores {
		
		private Random r;
		
		
		public FabricaEmbaralhadores(){
			r = new Random();
		}
		
		public Embaralhador novoEmbaralhador(){
			final int numeroEmbaralhadores = 2;
			Embaralhador e;

			switch (r.nextInt(numeroEmbaralhadores)) {
			case 1:
				e = new Embaralhador1();
				break;

			case 0:				
			default:
				e = new Embaralhador0();
				break;
			}
			
			return e;
		}
		
		
}
