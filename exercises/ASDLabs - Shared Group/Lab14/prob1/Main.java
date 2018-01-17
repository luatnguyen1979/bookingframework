package com.asd.lab14.prob1;

public class Main {
	public static void main(String[] args){
		IReversiMediator mediator = new IReversiMediatorImpl();
		Player whitePlayer = new PlayerTwo(mediator);
		Player blackPlayer = new PlayerOne(mediator);
		printBoard(mediator.getBoard());
	    blackPlayer.move(3, 2);
		printBoard(mediator.getBoard());
		blackPlayer.move(4, 2);
		printBoard(mediator.getBoard());
		whitePlayer.move(3, 2);
		printBoard(mediator.getBoard());
		blackPlayer.move(3, 5);  //Invalid move
		printBoard(mediator.getBoard());
		whitePlayer.move(5, 2); //Invalid move
		printBoard(mediator.getBoard());
		blackPlayer.move(2, 4);
		printBoard(mediator.getBoard());
		whitePlayer.move(5, 4);
		printBoard(mediator.getBoard());
	}
	
	public static void printBoard(Board board){
		System.out.println("******Board********");
		for(int i = 0; i < board.row; i++){
			for(int j = 0; j < board.column; j++){
				System.out.print(board.getCell(i, j).toString() + "    ");
			}
			System.out.println();
		}
	}
}
