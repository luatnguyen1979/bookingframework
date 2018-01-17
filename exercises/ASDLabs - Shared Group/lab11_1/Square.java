package lab11_1;

public class Square {
	private int size = 0;

	public Square(int size) {
		this.size = size;
		System.err.println("Square Created : " + size + " Size " + size);
	}

	public int getX() {
		return size;
	}

	public void scale(int multiply) {
		size = size * multiply;
		System.err.println("Square scaled" + multiply + " times, New Square Size: " + size + " Size " + size);
	}

	public void move(Direction direction, int steps) {
		String dir = direction == Direction.LEFT ? "Left" : "Right";
		System.err.println("Square moved to " + steps + " steps" + " " + dir);
	}

}
