package application;


public class Board extends Solver{
	//build board with player and solutions here
	//LOTS OF UNUSED METHODS THAT MIGHT BE HELPFUL FOR GENERATING SOLVABLE BOARD
	private final int GRID_SIZE = 9;
	private int[][] sol;
	private int[][] init;
	private int[][] player;
	
	public Board() {
		sol = new int[][] 
		{
			{7,3,2,4,5,8,6,1,9},
			{9,5,6,1,7,3,8,2,4},
			{1,8,4,6,2,9,5,3,7},
			{8,7,1,5,6,4,3,9,2},
			{6,4,3,8,9,2,7,5,1},
			{2,9,5,3,1,7,4,6,8},
			{3,2,9,7,8,6,1,4,5},
			{4,1,8,2,3,5,9,7,6},
			{5,6,7,9,4,1,2,8,3}
			};
			//INIT BOARD ONLY NEEDS 3 IN BOTTOM F0R TESTING PURPOSE. REAL INITIAL BOARD COMMENTED OUT BELOW
			init = new int[][]
			{
				{7,3,2,4,5,8,6,1,9},
				{9,5,6,1,7,3,8,2,4},
				{1,8,4,6,2,9,5,3,7},
				{8,7,1,5,6,4,3,9,2},
				{6,4,3,8,9,2,7,5,1},
				{2,9,5,3,1,7,4,6,8},
				{3,2,9,7,8,6,1,4,5},
				{4,1,8,2,3,5,9,7,6},
				{5,6,7,9,4,1,2,8,0}
				};
				/*
				{7,0,2,0,5,0,6,0,0},
				{0,0,0,0,0,3,0,0,0},
				{1,0,0,0,0,9,5,0,0},
				{8,0,0,0,0,0,0,9,0},
				{0,4,3,0,0,0,7,5,0},
				{0,9,0,0,0,0,0,0,8},
				{0,0,9,7,0,0,0,0,5},
				{0,0,0,2,0,0,0,0,0},
				{0,0,7,0,4,0,2,0,3}
				}
				*/
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
