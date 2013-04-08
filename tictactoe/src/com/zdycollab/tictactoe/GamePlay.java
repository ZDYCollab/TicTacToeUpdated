package com.zdycollab.tictactoe;

import com.badlogic.gdx.Game;

public class GamePlay{
	private static char mBoard[];
	private final static int BOARD_SIZE = 9;
	private final static int ROW = 3;
	
	public static final char HUMAN_PLAYER = 'X';
	public static final char ANDROID_PLAYER = 'O';
	public static final char EMPTY_SPACE = ' ';
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mBoard = new char[BOARD_SIZE];
		clearBoard();
		mBoard[1] = 'X';
		mBoard[4] = 'X';
		mBoard[7] = 'O';
		mBoard[2] = 'O';
		mBoard[8] = 'X';
	    AI newAI = new AI(HUMAN_PLAYER, ANDROID_PLAYER, ROW);
		System.out.println(newAI.getComputerMove(mBoard));
	}

	
		
	public static int getBoard_size() {
		return BOARD_SIZE;
	}

	
	public static void clearBoard() {
		for(int i = 0; i < BOARD_SIZE; i++)
			mBoard[i] = EMPTY_SPACE;
	}
	
	public void setMove(char player, int location) {
		mBoard[location] = player;
	}
	
	

	private int checkforWinner() {
		
		return 0;
	}


/*
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
*/

}
