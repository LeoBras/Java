import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static HashMap<String, String> processar(String nomeArquivo) throws LeituraArquivoException{
		File file;
		Scanner sc;
		HashMap<String, String> descValue = new HashMap<String, String>(); 
		String linha[];
	
		System.out.println(nomeArquivo);
		try {
			file = new File(nomeArquivo);
			sc = new Scanner(file);
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo"+e.getMessage());
		}
	
		if(!sc.hasNextLine())
			throw new LeituraArquivoException("Arquivo vazio");
		
		while (sc.hasNextLine()){
			  String s = sc.nextLine();
			  linha = s.split("->");
			  
			  System.out.println(linha.length);
			  System.out.println(linha[0]);
			  
			  if(linha.length != 2)
				  throw new LeituraArquivoException("Formato de arquivo inválido");
			 
			  descValue.put(linha[0], linha[1]);
		}	
		
		sc.close();
				
		return descValue;

	}
	
}