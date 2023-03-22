package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.time.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.text.Text;
public class Timer extends Application {
	Time time = new Time("00:0:0");

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text timer = new Text();
		Timeline timeline = new Timeline();
		
	}

}
