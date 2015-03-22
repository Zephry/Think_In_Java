package Eight.two;

public class RectangularGlyph extends Glyph {
	private int width = 10;
	RectangularGlyph(int width) {
		this.width = width;
		System.out.println("RoundGlyph.RectangularGlyph(), width = " + width);
	}
	void draw() {
		System.out.println("RectangularGlph.draw(), width = " + width);
	}
	
}
