package Five.two;

public class ProtectedClass {
	protected int a = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class class2 {
	ProtectedClass a;
	public void changeData() {
		a = new ProtectedClass();
		a.a = 33;
	}
}
