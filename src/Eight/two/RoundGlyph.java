package Eight.two;

public class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
	
//	public int print() {
//		return 0;
//	}
}
