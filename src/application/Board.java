package application;


public class Board extends Solver{
	
	public int[][] generateBoard() {
	   
	    int[][] board = new int[9][9];
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            board[i][j] = 0;
	        }
	    }

	    
	    int count = 0;
	    while (count < 17) {
	       
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
	
	
	private final int GRID_SIZE = 9;
	
	private int[][] sol;
	
	private int[][] init;
	
	private int[][] player;
	
	final int[][] initBoard = generateBoard();
	
	public Board() {
	
    int[][] solveBoard = new int[9][9];
    
    for (int row = 0; row < 9; row++) {
    	
        for (int col = 0; col < 9; col++) {
        	
            solveBoard[row][col] = initBoard[row][col];
            
        }
        
    }
	
	printtempBoard(initBoard);
	
	solve(solveBoard);
	
	System.out.println();
	
	printtempBoard(solveBoard);
	
		sol = solveBoard;
		
		init = new int[9][9];
				
	    player = new int[9][9];
				
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
		
		init = initBoard;
		
		getInit();
		
	}
	
	public int[][] blank(int[][] board) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				board[i][j] = 0;
			}
		}
		return board;
	}

	
	//public void buttonTest(Stage primaryStage) { // More testing using the "gridpane" class to set buttons objects in a grid + some cosmetic experiments
		
		/*
		 * 	primaryStage.setTitle("Sudoku Solver");
    
    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    
    button1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button2.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button3.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button4.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button5.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button6.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button7.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button8.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    button9.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
    
    GridPane gridPane = new GridPane();
    
    gridPane.setAlignment(Pos.BOTTOM_RIGHT);
    
    gridPane.add(button1, 0, 0);
    gridPane.add(button2, 1, 0);
    gridPane.add(button3, 2, 0);
    gridPane.add(button4, 0, 1);
    gridPane.add(button5, 1, 1);
    gridPane.add(button6, 2, 1);
    gridPane.add(button7, 0, 2);
    gridPane.add(button8, 1, 2);
    gridPane.add(button9, 2, 2);
    
    Scene scene = new Scene(gridPane, 800, 500);
        
    primaryStage.setScene(scene);
    
    primaryStage.setResizable(false);
    
    primaryStage.show();
		 */
		
	//}

}
