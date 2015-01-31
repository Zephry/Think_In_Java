package Eight.one;

public class People {
	
	public static void ride(Cycle c) {
//		c.run();
		c.fly();
//		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cycle c = new Cycle();
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		ride(u);
		ride(b);
//		ride(c);
	}

}
