package application;
//THIS IS PROBABLY DONE POORLY!
public class Box{
	private Cell[][] box = new Cell[3][3];

    public Box() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                box[i][j] = new Cell();
            }
        }
    }
}
