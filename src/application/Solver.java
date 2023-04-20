package application;
import java.io.*;
import java.util.*;

public abstract class Solver {
	final static int GRID_SIZE = 9;
	
	public boolean inRow(int[][] board, int num, int row) {
		for(int i = 0; i < GRID_SIZE; i++) {
			if(board[row][i] == num) {
				return true;
			}
		}
		return false;
	}
	public boolean inCol(int[][] board, int num, int col) {
		for(int i = 0; i < GRID_SIZE; i++) {
			if(board[i][col] == num) {
				return true;
			}
		}
		return false;
	}
	public boolean inBox(int[][] board, int num, int row, int col) {
		int boxRow = row - row % 3;
		int boxCol = col - col %3;
		for(int i = boxRow; i < boxRow + 3; i++) {
			for(int j = boxCol; j < boxCol +3; j++) {
				if(board[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isValid(int[][] board, int num, int row, int col) {
		return !inRow(board, num, row) && !inCol(board, num, col) && !inBox(board, num, row, col);
	}
	
	public boolean solve(int[][] board) {
		for(int row = 0; row < GRID_SIZE; row++) {
			for(int col = 0; col < GRID_SIZE; col++) {
				if(board[row][col] == 0) {
					for(int num = 1; num <= GRID_SIZE; num++) {
						if(isValid(board, num, row, col)) {
							board[row][col] = num;
							if(solve(board)) {
								return true;
							}
							else {
								board[row][col] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public void printBoard(int[][] board){
		for(int row = 0; row < GRID_SIZE; row++) {
			for(int col = 0; col < GRID_SIZE; col++) {
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
	}
		
	}

