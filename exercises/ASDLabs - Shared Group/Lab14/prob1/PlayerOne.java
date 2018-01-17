package com.asd.lab14.prob1;

public class PlayerOne extends Player {
	
	public PlayerOne(IReversiMediator mediator) {
		super(mediator);
		color = Cell.BLACK;
	}

	@Override
	public Cell move(int iRow, int jColumn) {
		return mediator.move(this, iRow, jColumn);
	} 
	
}
