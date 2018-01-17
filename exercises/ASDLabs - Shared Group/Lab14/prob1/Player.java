package com.asd.lab14.prob1;

public abstract class Player {
	protected IReversiMediator mediator;
	public Cell color;
	
	public Player(IReversiMediator mediator){
		this.mediator = mediator;
	}
	public Cell getColor(){
		return color;
	}
	abstract Cell move(int iRow, int jColumn);
}
