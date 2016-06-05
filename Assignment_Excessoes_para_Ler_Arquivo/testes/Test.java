import static org.junit.Assert.*;

import java.util.Map;

public class Test {

	@org.junit.Test
	public void test_ArquivoNaoExiste(){	
		try {
			ProcessadorArquivo.processar("NaoExiste.txt");
			fail("Falhou em detectar arquivo nao existente");
		} catch (LeituraArquivoException e) {
			if(!(e.getMessage().startsWith("Erro ao abrir o arquivo")))
				fail("Mensagem incoreta");
		}				
	}
	
	@org.junit.Test
	public void test_ArquivoVazio(){	
		try {
			ProcessadorArquivo.processar("ArquivoVazio.txt");
			fail("Falhou em detectar arquivo vazio");
		} catch (LeituraArquivoException e) {
			assertEquals(e.getMessage(), "Arquivo vazio");
		}				
	}
	
	@org.junit.Test
	public void test_FormatoInvalido(){	
		try {
			ProcessadorArquivo.processar("FormatoInvalido_3Campos.txt");
			fail("Falhou em detectar formato invalido");
		} catch (LeituraArquivoException e) {
			assertEquals(e.getMessage(), "Formato de arquivo inválido");
		}
		
		try {
			ProcessadorArquivo.processar("FormatoInvalido_1Campo.txt");
			fail("Falhou em detectar formato invalido");
		} catch (LeituraArquivoException e) {
			assertEquals(e.getMessage(), "Formato de arquivo inválido");
		}	
	}
	
	@org.junit.Test
	public void test_FormatoCorreto() 
			throws LeituraArquivoException{	
		
		Map<String, String> processado;
		processado = ProcessadorArquivo.processar("Formato_Correto.txt");
		assertEquals(processado.get("Nome"), "Jose");
		assertEquals(processado.get("Sobrenome"), "Silva");
		assertEquals(processado.get("Cidade"), "Sao Paulo");
		assertEquals(processado.get("Rua"), " ");
		
	}

}
