package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Board extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {	
		
		final Rectangle rec = new Rectangle(100, 100, 500, 500);
		rec.setStroke(Color.BLACK);
		rec.setFill(Color.WHITE);
		
		
		
		Pane pane = new Pane();
		pane.getChildren().add(rec);
		
		Scene scene = new Scene(pane, 1000, 700);
		primaryStage.setTitle("Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}
	
	public void buttonTest(Stage primaryStage) { // More testing using the "gridpane" class to set buttons objects in a grid + some cosmetic experiments
		
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
		
	}

}
