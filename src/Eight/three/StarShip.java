package Eight.three;

public class StarShip {
	private AlertStatus status = new WarnStatus();
	public void alert() {
		status.alert();
	}
	public void up() {
		status = new ErrorStatus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarShip ss = new StarShip();
		ss.alert();
		ss.up();
		ss.alert();
	}

}
