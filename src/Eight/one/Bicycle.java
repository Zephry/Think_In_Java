package Eight.one;

public class Bicycle extends Cycle {
	public void run() {
		System.out.println("Bicycle running");
	}
	public void fly() {
		System.out.println("Bicycle can not fly");
//		run();     
	};
	public String toString() {
		return "I am Bicycle";
	}
	public void blance() {
		System.out.println("I can balance");
	}
}
