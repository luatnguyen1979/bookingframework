/**
 * 
 */
package asd.day10.lab12_1;

/**
 * @author luatnguyen
 *
 */
public class PlayerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IMediator mediator = new Mediator();
		Player whitePlayer = new WhitePlayer(mediator);
		Player blackPlayer = new BlackPlayer(mediator);
		mediator.displayBoard();
		blackPlayer.move(4, 5);
		mediator.displayBoard();
		whitePlayer.move(2, 3);
		mediator.displayBoard();
		blackPlayer.move(5, 2);
		mediator.displayBoard();
		whitePlayer.move(4, 5);
		mediator.displayBoard();
		blackPlayer.move(2, 5);
		mediator.displayBoard();
		whitePlayer.move(5, 3);
		mediator.displayBoard();
		blackPlayer.move(6, 1);
		mediator.displayBoard();
	}

}
