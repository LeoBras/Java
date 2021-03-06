import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException{
		File file = new File(nomeArquivo);
		Scanner sc;
		Map<String, String> descValue = new HashMap<String, String>(); 
		String linha[];
	
		try {
			sc = new Scanner(file);
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo"+e.getMessage());
		}
	
		if(!sc.hasNextLine())
			throw new LeituraArquivoException("Arquivo vazio");
		
		while (sc.hasNextLine()){
			  String s = sc.nextLine();
			  linha = s.split("->");
				  
			  if(linha.length != 2)
				  throw new LeituraArquivoException("Formato de arquivo inválido");
				  
			  descValue.put(linha[0], linha[1]);
		}	
		
		sc.close();
				
		return descValue;
		

	}
	
}
