package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;

public class MyJavaFX extends Application {
	MediaPlayer player;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final Button b = new Button("pause");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(player.getStatus()==Status.PAUSED) {
					player.play();
					b.setText("pause");
				} else {
					player.pause();
					b.setText("play!");
				}
			}
		});
		
		final StackPane sp = new StackPane();
		sp.getChildren().add(b);
		
		player = new MediaPlayer(new Media(getClass().getResource("popSound.wav").toString()));
		player.play();
		
		primaryStage.setScene(new Scene(sp));
		primaryStage.show();
	}
}