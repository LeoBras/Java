import java.io.IOException;

public class Mecanica0 implements MecanicaDoJogo {

	int tamanhoCircuito;
	int pontuacao;
	String palavra;
	BancoDePalavras bp;
	FabricaEmbaralhadores fe;
	
	
	public Mecanica0(int tamanhoCircuito) throws IOException{
		this.tamanhoCircuito = tamanhoCircuito;
		bp = new BancoDePalavras("palavras.txt");
		fe = new FabricaEmbaralhadores();
	}
	
	@Override
	public boolean jogoAcabou() {
		if(tamanhoCircuito > 0 )
			return false;
		
		bp.fechar();
		return true;
	}

	@Override
	public boolean verificaPalavra(String palavra) {
		tamanhoCircuito--;
		if(palavra.equalsIgnoreCase(this.palavra)){
			pontuacao++;
			return true;
		}
			
		return false;
	}

	@Override
	public boolean temMaisChance() {
		return false;
	}

	@Override
	public int pontuacaoFinal() {
		return pontuacao;
	}

	@Override
	public String embaralhada(){
		palavra = bp.novaPalavra();
		Embaralhador emb = fe.novoEmbaralhador();
		
		return emb.embaralha(palavra);
	}

}
