package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Board bor = new Board();
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
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			bor.start(primaryStage);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
