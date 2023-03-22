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
	
	public static void checkRow(Row row) {
        for(int i = 1; i <= 9; i++) {
            int count = 0;
            for(int j = 0; j < 9; j++) {
               // if()
            }
        }
    }
    public static void checkNum(Cell cell){
        int c = 0;
        for(int i = 1; i <= 9; i++) {
            //if num not in box
                //c++;
            //if num not in row

                //c++;
            //if num not in column
                //c++;
            if(c == 3) {
                cell.addNote(i);
            }
        }
    }
    /*
    public static void compare(Row row) {
        for(int i = 0; i < 8; i++) {
            int[] tempCell1 = row[i].getNote();
            int[] tempCell2 = row[i + 1]. getNote();
            for(int j = 0; j < tempCell1.length(); j++) {
                for(int k = 0; k < tempCell2.length(); k++) {

                }
            }
        }
    }

     */
	public static void main(String[] args) {
		launch(args);
	}
}
