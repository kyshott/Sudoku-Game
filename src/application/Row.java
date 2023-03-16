package application;

public class Row {
	private Cell[] row = new Cell[9];

    public Row() {
        for(int i = 0; i < 9; i++) {
                row[i] = new Cell();
        }
    }
}
