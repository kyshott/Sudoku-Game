package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.canvas.GraphicsContext;


public class Controller implements Initializable{
	int psr;
	int psc;
	Board bor;
	@FXML Button button1;
	@FXML Button button2;
	@FXML Button button3;
	@FXML Button button4;
	@FXML Button button5;
	@FXML Button button6;
	@FXML Button button7;
	@FXML Button button8;
	@FXML Button button9;
	@FXML Button buttonUndo;
	@FXML Canvas canvas;
	
	@Override
	public void initialize(URL args0, ResourceBundle args1) {
		bor = new Board();
		GraphicsContext gc = canvas.getGraphicsContext2D();
		drawOnCanvas(gc);
		this.psc = 0;
		this.psr = 0;
	}
	public void drawOnCanvas(GraphicsContext gc) {
		gc.clearRect(0, 0, 450, 450);
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int y = i * 50 + 2;
				int x = j * 50 + 2;
				int widthx;
				int widthy;
				if(i == 2 || i == 5) {
					widthx = 47;
				}
				else {
					widthx = 49;
				}
				if(j == 2 || j == 5) {
					widthy = 47;
				}
				else {
					widthy = 49;
				}
				gc.setFill(Color.WHITE);
				gc.fillRoundRect(x, y, widthy, widthx, 10, 10);
			}
		}
		gc.setStroke(Color.RED);
		gc.setLineWidth(5);
		gc.strokeRoundRect(psc * 50 + 2, psr * 50 + 2, 47, 47, 10, 10);
		
		
		int[][] init = bor.getInit();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int posy = i * 50 + 33;
				int posx = j * 50 + 20;
				gc.setFill(Color.BLACK);
				gc.setFont(new Font(20));
				if(init[i][j] != 0) {
					gc.fillText(init[i][j] + "", posx, posy);
					
				}
			}
		}
		
		int[][] player = bor.getPlayer();
		int[][] sol = bor.getSol();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int posy = i * 50 + 33;
				int posx = j * 50 + 20;
				if(player[i][j] == sol[i][j]) {
					gc.setFill(Color.GREEN);
				}
				else {
				gc.setFill(Color.RED);
				}
				gc.setFont(new Font(22));
				if(player[i][j] != 0) {
					gc.fillText(player[i][j] + "", posx, posy);
				}
			}
		}
		int[][] combine = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(init[i][j] != 0) {
					combine[i][j] = init[i][j];
				}
				else {
					combine[i][j] = player[i][j];
				}
			}
		}
		//THIS DOESN'T WORK YET
		if(combine == sol) {
			gc.clearRect(0, 0, 450, 450);
			gc.setFill(Color.GREEN);
			gc.setFont(new Font(36));
			gc.fillText("SUCCESS!", 150, 250);
		}
		
	}
	
	public void whenClicked() {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				int mx = (int) event.getX();
				int my = (int) event.getY();
				psr = (int) (my / 50);
				psc = (int) (mx / 50);
				drawOnCanvas(canvas.getGraphicsContext2D());
			}
		});
	}
	
	public void buttonStartPressed() {
		bor.setBoard();
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	
	public void buttonUndoPressed() {
		bor.modifyPlayer(0, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	
	public void buttonOnePressed() {
		bor.modifyPlayer(1, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonTwoPressed() {
		bor.modifyPlayer(2, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonThreePressed() {
		bor.modifyPlayer(3, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonFourPressed() {
		bor.modifyPlayer(4, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonFivePressed() {
		bor.modifyPlayer(5, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonSixPressed() {
		bor.modifyPlayer(6, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonSevenPressed() {
		bor.modifyPlayer(7, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonEightPressed() {
		bor.modifyPlayer(8, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	public void buttonNinePressed() {
		bor.modifyPlayer(9, psr, psc);
		drawOnCanvas(canvas.getGraphicsContext2D());
	}
	
}
