package com.asd.lab14.prob1;

public class IReversiMediatorImpl implements IReversiMediator {
	public Board board;
	public Player currentPlayer;
	
	public IReversiMediatorImpl(){
		board = new Board();		
	}


	@Override
	public Board getBoard(){
		return board;
	}
	
	@Override
	public Cell move(Player player, int iRow, int jCol) {
		if(isValidMove(player, iRow, jCol)){
			board.setCell(iRow, jCol, player.getColor());
			markCells(player, iRow, jCol);
			currentPlayer = player;
			if(isGameOver() != Cell.NONE){
				return isGameOver();
			}
		}
		return Cell.NONE;
	}

	@Override
	public boolean isValidMove(Player player, int iRow, int jCol){
		
		if(currentPlayer == player) return false; 					//If white have just move, then back move next
		if(board.getCell(iRow, jCol) != Cell.NONE) return false; 	//move to empty cell
		
		Cell playerColor = player.getColor();
		//Neighbor Area
		int iUp = iRow > 0 ? iRow - 1 : 0;
		int iDown = iRow < Board.row - 1 ? iRow + 1 : iRow;
		int jLeft = jCol > 0 ? jCol - 1 : 0;
		int jRight = jCol < Board.column - 1 ? jCol + 1 : jCol;

		for(int i = iUp; i<=iDown; i++){
			for(int j = jLeft; j<=jRight; j++){
				if(board.getCell(i, j) != playerColor && board.getCell(i, j) != Cell.NONE){//surroun cell has different color
					if(j == jCol){
						if(i == iDown){
							for(int k = i + 1; k < board.row; k++){
								if(board.getCell(k, jCol) == playerColor)    //Same color 
								{
									return true;
								}
							}
						} else if(i == iUp){
							for(int k = i - 1; k>= 0; k--){
								if(board.getCell(k, jCol) == playerColor)    //Same color 
								{
									return true;
								}
							}
						}
					}else if (i == iRow){
						if(j == jRight){
							for(int k = j + 1; k < board.column; k++){
								if(board.getCell(iRow, k) == playerColor)    //Same color 
								{
									return true;
								}
							}
						} else if(j == jLeft){
							for(int k = j - 1; k>= 0; k--){
								if(board.getCell(iRow, k) == playerColor)    //Same color 
								{
									return true;
								}
							}
						}
					} else { // i != iRow && j != jColumn
						if(i == iDown && j == jRight){
							for(int k = 1; k+i<board.row && k+j<board.row ; k ++){
									if(board.getCell(i+k, j+k) == playerColor)		{
										return true;
								}
							}
						}
						if(i == iUp && j == jLeft){
							for(int k = 1; i-k > 0 && j-k>0 ; k ++){
									if(board.getCell(i-k, j-k) == playerColor)		{
										return true;
								}
							}
						} else if(i == iUp && j == jRight){
							for(int k = 1; i-k > 0 && j+k<board.row ; k ++){
								if(board.getCell(i-k, j+k) == playerColor)		{
									return true;
								}
							}
						} else if(i == iDown && j == jLeft){
							for(int k = 1; i+k <board.row && j-k>0 ; k ++){
								if(board.getCell(i+k, j-k) == playerColor)		{
									return true;
								}
							}
						}
					}
				}
			}
			
		}
		return false;
	}
	@Override
	public void markCells(Player player, int iRow, int jCol) {
		Cell playerColor = player.getColor();
		int iUp = iRow > 0 ? iRow - 1 : 0;
		int iDown = iRow < Board.row - 1 ? iRow + 1 : iRow;
		int jLeft = jCol > 0 ? jCol - 1 : 0;
		int jRight = jCol < Board.column - 1 ? jCol + 1 : jCol;

		for(int i = iUp; i<=iDown; i++){
			for(int j = jLeft; j<=jRight; j++){
				if(board.getCell(i, j) != playerColor && board.getCell(i, j) != Cell.NONE){				//Neighbor cell has different color
					System.out.println("i, j: " + i + ", " + j);
					if(j == jCol){
						if(i == iDown){
							int k;
							for(k = i + 1; k < board.row; k++){
								if(board.getCell(k, jCol) == playerColor){    //Same color 
									k++;
									break;
								}
							}
							if( k > i+1 && k < board.row){
								for(int m = i; m<=k-1; m++){
									board.setCell(m, jCol, playerColor);
								}
							}
						} else if(i == iUp){
							int k;
							for(k = i - 1; k>= 0; k--){
								if(board.getCell(k, jCol) == playerColor)    //Same color 
								{
									k--;
									break;
								}
							}
							if( k < i-1 && k >= 0){
								for(int m = i; m>=k+1 ; m--){
									board.setCell(m, jCol, playerColor);
								}
							}
						}
					}else if (i == iRow){
						if(j == jRight){
							int k;
							for(k = j + 1; k < board.column; k++){
								if(board.getCell(iRow, k) == playerColor)    //Same color 
								{
									k++;
									break;
									
								}
							}
							if( k > j + 1 && k < board.column){
								for(int m = j; m <= k-1 ; m++){
									board.setCell(iRow, m, playerColor);
								}
							}
						} else if(j == jLeft){
							int k;
							for(k = j - 1; k>= 0; k--){
								if(board.getCell(iRow, k) == playerColor){    //Same color 
									k--;
									break;
								}
							}
							if( k < j - 1 && k >= 0){
								for(int m = j; m >= k+1 ; m--){
									board.setCell(iRow, m, playerColor);
								}
							}
						}
					} else {
						if(i == iDown && j == jRight){
							int k;
							for(k = 1; k+i<board.row && k+j<board.row ; k ++){
								if(board.getCell(i+k, j+k) == playerColor){	
									k++;
									break;
								}
							}
							if( k > 1 && k+i<board.row && k+j<board.row){
								for(int m = 0; m <= k-1 ; m++){
									board.setCell(i+m, j+m, playerColor);
								}
							}
						}
						if(i == iUp && j == jLeft){
							int k;
							for(k = 1; i-k > 0 && j-k>0 ; k ++){
								if(board.getCell(i-k, j-k) == playerColor){
									k++;
									break;
								}
							}
							if( k > 1 && i-k > 0 && j-k>0){
								for(int m = 0; m <= k-1 ; m++){
									board.setCell(i-m, j-m, playerColor);
								}
							}
						} else if(i == iUp && j == jRight){
							int k;
							for(k = 1; i-k > 0 && j+k<board.row ; k ++){
								if(board.getCell(i-k, j+k) == playerColor){
									k++;
									break;
								}
							}
							if( k > 1 && i-k > 0 && j+k<board.row ){
								for(int m = 0; m <= k-1 ; m++){
									board.setCell(i-m, j+m, playerColor);
								}
							}
						} else if(i == iDown && j == jLeft){
							int k;
							for(k = 1; i+k<board.row && j-k>0 ; k ++){
								if(board.getCell(i+k, j-k) == playerColor){
									k++;
									break;
								}
							}
							if( k > 1 && i+k <board.row && j-k>0){
								for(int m = 0; m <= k-1 ; m++){
									board.setCell(i+m, j-m, playerColor);
								}
							}
						}
					}
				}
			}
		}
			
	}
	


	@Override
	public Cell isGameOver() {
		int whiteCount = 0;
		int blackCount = 0;
		for(int i = 0; i<board.row; i++){
			for(int j = 0; j<board.column; j++){
				if(board.getCell(i, j) == Cell.BLACK) blackCount++;
				else if (board.getCell(i, j) == Cell.WHITE) whiteCount++;
				else if(board.getCell(i, j) == Cell.NONE){
					return Cell.NONE;
				}
			}
		}
		return whiteCount > blackCount ? Cell.WHITE : Cell.BLACK;
	}
}
