
public class Embaralhador1 implements Embaralhador {

	public String embaralha(String palavra) {
		int l = palavra.length();
		char embaralhada[] = new char[l];
		for (int i = 0; i < l; i++)
			embaralhada[l-i] = palavra.charAt((i*2) % palavra.length());
		
		return embaralhada.toString();
	}

}
