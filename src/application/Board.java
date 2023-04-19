package application;

import java.util.Random;

public class Board extends Solver{
	
	public int[][] generateBoard() {
	   
	    int[][] board = new int[9][9];
	    
	    for (int i = 0; i < 9; i++) {
	    	
	        for (int j = 0; j < 9; j++) {
	        	
	            board[i][j] = 0;
	            
	        }
	        
	    }
	    
	    int count = 0;
	    
	    while (count < 20) {
	       
	        int row = (int) (Math.random() * 9);
	        
	        int col = (int) (Math.random() * 9);
	        
	        if (board[row][col] != 0) {
	        	
	            continue;
	            
	        }

	       
	        int val = (int) (Math.random() * 9) + 1;
	        
	        if (isPossible(board, row, col, val)) {
	        	
	            board[row][col] = val;
	            
	            count++;
	            
	        }
	        
	    }
	    
	    return board;
	}


	public static void printtempBoard(int[][] board) {
		
	    for (int i = 0; i < 9; i++) {
	    	
	        for (int j = 0; j < 9; j++) {
	        	
	            System.out.print(board[i][j] + " ");
	            
	        }
	        
	        System.out.println();
	    }
	    
	}

	
	public static boolean isPossible(int[][] board, int row, int col, int val) {
	   
	    for (int i = 0; i < 9; i++) {
	    	
	        if (board[row][i] == val || board[i][col] == val) {
	        	
	            return false;
	        }
	    }

	    int subRow = (row / 3) * 3;
	    
	    int subCol = (col / 3) * 3;
	    
	    for (int i = subRow; i < subRow + 3; i++) {
	    	
	        for (int j = subCol; j < subCol + 3; j++) {
	        	
	            if (board[i][j] == val) {
	            	
	                return false;
	                
	            }
	        }
	    }

	    return true;
	}
	
	static int[][] sol;
	
	int[][] init;
	
	private int[][] player;
	
	private int[][] copyBoard = new int[9][9];
	
	public Board() {
		
	int[][] board = generateBoard();
	
	solve(board);
	
	while (!(solve(board))) {
		
		board = generateBoard();
		
		if (solve(board)) {
			
			break;
			
		}
		
	}
	
	System.out.println();
	
		sol = board;
		
		init = new int[9][9];
				
	    player = new int[9][9];
	    
	    for (int row = 0; row < 9; row++) {
	    	
	        for (int col = 0; col < 9; col++) {
	        	
	            copyBoard[row][col] = board[row][col];
	            
	        }
	        
	    }
				
	}
	
	public static void removeCells(int[][] board) {
		
	    Random random = new Random();
	    
	    int numCellsToRemove = 81 - 30;
	    
	    while (numCellsToRemove > 0) {
	    	
	        int row = random.nextInt(9);
	        
	        int col = random.nextInt(9);
	        
	        if (board[row][col] != 0) {
	        	
	            board[row][col] = 0;
	            
	            numCellsToRemove--;
	            
	        }
	    }
	}
	
	public int[][] getSol() {
		return sol;
	}
	
	public int[][] getInit() {
		return init;
	}
	
	public int[][] getPlayer() {
		return player;
	}
	
	public void modifyPlayer(int num, int row, int col) {
		if(init[row][col] == 0) {
		if(num >= 0 && num <= GRID_SIZE) {
			player[row][col] = num;
		}
		else {
			System.out.println("Number out of range.");
		}
		}
	}
	
	public void setBoard() {
		
		removeCells(copyBoard);
		
		init = copyBoard;
		
		getInit();
		
	}

}