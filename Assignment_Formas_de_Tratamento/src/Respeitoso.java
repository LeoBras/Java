
public class Respeitoso implements FormatadorNome {

	boolean isMale;
	
	public Respeitoso(boolean isMale){
		this.isMale = isMale;
	}
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(isMale)
			return ("Sr. "+sobrenome);
		else
			return ("Sra. "+sobrenome);
	}

}
