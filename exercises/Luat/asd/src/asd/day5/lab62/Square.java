/**
 * 
 */
package asd.day5.lab62;


/**
 * @author luatnguyen
 *
 */
public class Square {
	private int width = 0;

	public Square(int width) {
		this.width = width;
		System.out.println("Creating Square with width: " + width);
	}

	public int getWidth() {
		return width;
	}

	public void scale(int multiply) {
		width = width * multiply;
		System.out.println("Scaling Square: " + multiply + " times, New Square with width: " + width);
	}

	public void move(Direction direction, int steps) {
		String dir = direction == Direction.LEFT ? "Left" : "Right";
		System.out.println("Moving Square with " + steps + " steps" + " " + dir);
	}

}
