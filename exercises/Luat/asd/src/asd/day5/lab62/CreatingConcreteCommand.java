package asd.day5.lab62;

/**
 * @author luatnguyen
 *
 */
public class CreatingConcreteCommand implements Command{
	Square square;
	int width;
	
	public CreatingConcreteCommand(int x){
		this.width  = x;
	}
	@Override
	public void execute() {
		square = new Square(width);
	}

	@Override
	public void undo() {
		width = 0;
	}
	
	public Square getSquare(){
		return square;
	}

}
