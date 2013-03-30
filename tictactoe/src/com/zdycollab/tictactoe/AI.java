package com.zdycollab.tictactoe;


import java.util.HashMap;
import java.util.Iterator;


public class AI {

	private int row, col;

	public char human;
	public char ai;
	public char board[];

	public AI(char HUMAN_PLAYER, char ANDROID_PLAYER, int r) {
		human = HUMAN_PLAYER;
		ai = ANDROID_PLAYER;
		row = r;
		col = r;
	}

	//return the best move for AI
	public int getComputerMove(char[] board) {
		//key == position
		//value == state
		HashMap<Integer, char[]> successors = successors_and_moves(board);
		int position = Integer.MIN_VALUE;
		for(Iterator<Integer> key = successors.keySet().iterator(); key.hasNext();) {
			int current = key.next();
			int temp = staticEvalFunc(successors.get(current));
			if(position < temp)
				position = current;
		}
		return position;
	}

	public int space(char[] state) {
		int space = 0;
		for(int i = 0; i < state.length; i++) {
			if(state[i] == ' ') {
				space++;
			}
		}
		return space;
	}

	public int staticEvalFunc(char[] state) {
		int pow = 0;
		
		//rows
		for(int i = 0; i < state.length; i+=col) {
			for (int j = 0; j < state.length / row; j++) {
				if(state[i + j] == ai) {
					pow += 1;
				} else if(state[i + j] == human) {
					pow -= 1;
				}
			}
		}

	//columns
		for(int i = 0; i < state.length / row; i++) {
			for(int j = 0; j < state.length / col; j+= row) {
				if(state[i + j] == ai) {
					pow += 1;
				} else if(state[i + j] == human) {
					pow -= 1;
				}
			}
		}
	
		//diagonals
		for(int i = 0; i < state.length; i+=row + 1) {
			if(i+row < state.length) {
				if(state[i+row] == ai) {
					pow += 1;
				} else if(state[i] == human) {
					pow -= 1;
				}
			}
		}
	
		//backward diagonals
		for(int i = row - 1; i < state.length - 1; i+=(row-1)) {
			if(i+row < state.length - 1) {
				if(state[i+row] == ai) {
					pow += 1;
				} else if(state[i] == human) {
					pow -= 1;
				}
			}
		}
		return (int)Math.pow(10, pow);
	}


	public HashMap<Integer, char[]> successors_and_moves(char[] state) {
		HashMap<Integer, char[]> states = new HashMap<Integer, char[]>();
		for(int i = 0; i < state.length; i++) {
			char[] temp = state.clone();
			if(temp[i] == ' ') {
				temp[i] = ai;
				states.put(i, state);
			}	
		}
		return states;
	}

}

