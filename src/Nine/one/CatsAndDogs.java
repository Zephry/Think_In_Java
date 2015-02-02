package Nine.one;

import java.util.*;

public class CatsAndDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector cats = new Vector();
//		cats.add(new Dog(1));
		cats.add(new Cat(2));
		cats.toString();
//		cats.get(0).print();
		show((Cat) cats.get(0));
		List dogs = new ArrayList();
		Collection c = new ArrayList();
	}
	
	public static void show(Cat c) {
		c.print();
	}
}
