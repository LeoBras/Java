import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipos de jogo:");
		System.out.println("1 - Hardcore (1 erro)");
		System.out.println("2 - 3 erros");
		System.out.println("3 - 5 erros");
		System.out.println("4 - Melhor em 10 palavras");
		System.out.println("5 - Melhor em 20 palavras");
		System.out.println("6 - Melhor em 30 palavras");
		
		MecanicaDoJogo tipo = FabricaMecanicaDoJogo.escolheMecanica(sc.nextInt());
		boolean acertou;
		
		do{
			System.out.println("Nova palavra embaralhada "+tipo.embaralhada());
			int contador = 1;
			acertou = false;
			do{
				System.out.println("Chance #"+contador++);
				acertou = tipo.verificaPalavra(sc.nextLine());
			}while(tipo.temMaisChance() && !acertou);
			
			if(acertou)
				System.out.println("Parabéns, você acertou!\n");
			else
				System.out.println("Acabaram as tentativas!\n");
			
		}while(!tipo.jogoAcabou());
		
		System.out.println("Fim do jogo!\n Pontuação: "+tipo.pontuacaoFinal());
		
		sc.close();
	}

}
