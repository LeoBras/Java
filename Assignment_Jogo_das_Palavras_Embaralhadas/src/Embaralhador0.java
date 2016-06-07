
public class Embaralhador0 implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		char embaralhada[] = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++)
			embaralhada[i] = palavra.charAt((i*3) % palavra.length());
		
		return embaralhada.toString();
	}

}
