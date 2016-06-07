import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

/*BancoDePalavras :   classe que possui um método que retorna uma palavra retirada 
 * aleatóriamente de uma lista de palavras lida a partir de um arquivo.
 */

public class BancoDePalavras {
	Random geraNumero;
	int tamanho;
	Stream<String> f;
	
	public BancoDePalavras(String banco) throws IOException{
	
		geraNumero = new Random();
			
		f = Files.lines(Paths.get(banco));
		this.tamanho = (int) f.count();
		System.out.println(this.tamanho);
	}
	
	public String novaPalavra(){
		int r = geraNumero.nextInt(tamanho);
		System.out.println(r);

		return f.skip(r).findFirst().get();	
	}
	
	
	public void fechar(){
		f.close();
	}
}
