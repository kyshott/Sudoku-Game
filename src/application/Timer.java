package application;

import javafx.application.Application;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Timer extends Application {
	
	int seconds = 0;

	@Override
	public void start(Stage primaryStage) {
		
		Label time = new Label("0 Seconds");
		
		EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
		
		@Override 
		
		public void handle(ActionEvent event) {
			
			seconds++;
			
			time.setText(seconds + " seconds");
			
		}
		
		
	};
	
	KeyFrame frame = new KeyFrame(Duration.seconds(1), eventHandler);
	
	Timeline counting = new Timeline(frame);
	
	counting.play();
	
	Scene scene = new Scene(time);
	
	primaryStage.setScene(scene);
	
	primaryStage.show();
	
}
	
}
