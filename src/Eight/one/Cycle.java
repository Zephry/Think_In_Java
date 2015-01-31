package Eight.one;

public class Cycle {
	public void run(){
		System.out.println("Cycle running");
	}
	
	public String toString() {
		return "I am Cycle";
	}
	
	public void fly() {
		run();
	}
	
}
