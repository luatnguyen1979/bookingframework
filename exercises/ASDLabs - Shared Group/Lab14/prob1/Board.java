package com.asd.lab14.prob1;

public class Board {
	public static int row = 8;
	public static int column = 8;
	public Cell[][] cells;
	
	public Board(){
		cells = new Cell[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				cells[i][j] = Cell.NONE;
			}
		}
		//Initial position
		cells[3][3] = Cell.BLACK;
		cells[3][4] = Cell.WHITE;
		cells[4][3] = Cell.WHITE;
		cells[4][4] = Cell.BLACK;
	}
	
	public void setCell(int iRow, int jColumn, Cell value){
		cells[iRow][jColumn] = value;
	}
	
	public Cell getCell(int iRow, int jColumn){
		return cells[iRow][jColumn];
	}
	
}

enum Cell{
	BLACK, WHITE, NONE;
}