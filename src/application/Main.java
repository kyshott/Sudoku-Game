package application;	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.*;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*
		
		//TESTING BOARD. NEEDS TO BE OUTPUTED TO THE GUI AND NOT CONSOLE
				try {
						int[][] testBoard = {
								{7,0,2,0,5,0,6,0,0},
								{0,0,0,0,0,3,0,0,0},
								{1,0,0,0,0,9,5,0,0},
								{8,0,0,0,0,0,0,9,0},
								{0,4,3,0,0,0,7,5,0},
								{0,9,0,0,0,0,0,0,8},
								{0,0,9,7,0,0,0,0,5},
								{0,0,0,2,0,0,0,0,0},
								{0,0,7,0,4,0,2,0,3}
								};
						Solver solver = new Solver();
						solver.solve(testBoard);
						solver.printBoard(testBoard);
						System.out.println();
						
						
					
					//STARTING OF STAGE
					Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
					Scene scene = new Scene(root, 720, 480);
					primaryStage.setTitle("Sudoku Game");
					primaryStage.setScene(scene);
					primaryStage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		*/

		Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
		Scene scene = new Scene(root, 720, 480);
		primaryStage.setTitle("Sudoku Game");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
