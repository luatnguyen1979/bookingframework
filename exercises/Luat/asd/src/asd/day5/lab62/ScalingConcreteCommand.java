package asd.day5.lab62;

/**
 * @author luatnguyen
 *
 */
public class ScalingConcreteCommand implements Command{
	int times;
	Square square;
	
	public ScalingConcreteCommand(Square square, int times){
		this.square = square;
		this.times = times;
	}
	
	@Override
	public void execute() {
		square.scale(times);
	}

	@Override
	public void undo() {
		int width = square.getWidth();
		square = new Square(width/times);
	}

}
