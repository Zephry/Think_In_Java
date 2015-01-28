package Four.one;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(Chair.created != 48) {
			new Chair();
			new String(" to take up more space");
		}
//		System.runFinalization();
		System.gc();
		System.runFinalization();
	}
	
}
