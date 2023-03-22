package application;
import javafx.application.Application;
import javafx.scene.Scene;
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

}
