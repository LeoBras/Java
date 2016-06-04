public class Relogio {
	private long forceValue = 0;
	
	public long agora(){
		if(forceValue == 0)
			return System.currentTimeMillis();
		else
			return forceValue;
	}
	public void setForceValue(long force){
		forceValue = force;
	}
}
