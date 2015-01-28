package Four.one;

public class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	
	int i;
	
	Chair() {
		i = ++created;
		if(created == 47) {
			System.out.println("Created 47");
		}
	}
	
	protected void finalize() {
		System.out.println("Finalizing #" + i + " Chair");
		if(!gcrun) {
			gcrun = true;
			System.out.println("Beginning to finalize after " + created + " Charis have been created");
		}
		if(i == 47) {
			System.out.println("Finalizing chair 47    setting flag to stop chair creation");
			f = true;
		}
		finalized++;
		if(finalized < created) {
			System.out.println("Now " + (created - finalized) + " chairs live");
		}
	}
}
