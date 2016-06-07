import java.io.IOException;

public class Mecanica1 implements MecanicaDoJogo {

	int chancesRestantes;
	int erros;
	int pontuacao;
	String palavra;
	BancoDePalavras bp;
	FabricaEmbaralhadores fe;
	
	
	public Mecanica1(int erros) throws IOException{
		this.erros = erros;
		bp = new BancoDePalavras("palavras.txt");
		fe = new FabricaEmbaralhadores();
	}
	
	@Override
	public boolean jogoAcabou() {
		if(erros > 0 )
			return false;
		
		bp.fechar();
		return true;
		
//		return (erros <= 0);
	}

	@Override
	public boolean verificaPalavra(String palavra) {
		if(palavra.equalsIgnoreCase(this.palavra)){
			pontuacao += chancesRestantes;
			return true;
		}
		if(--chancesRestantes <= 0)
			erros--;
			
		return false;
	}

	@Override
	public boolean temMaisChance() {
		return (chancesRestantes > 0);
	}

	@Override
	public int pontuacaoFinal() {
		return pontuacao;
	}

	@Override
	public String embaralhada(){
		palavra = bp.novaPalavra();
		Embaralhador emb = fe.novoEmbaralhador();
		chancesRestantes = 3;
		
		return emb.embaralha(palavra);
	}

}
