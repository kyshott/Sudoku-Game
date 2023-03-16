package application;

public class Cell {
	private int num;
    private int[] note;

    public Cell(){
        note = new int[9];
        num = 0;
    }

    public void setNum(int newNum) {
        num = newNum;
    }
    public void addNote(int num) {
        note[num] = num;
    }
    public void clearNote() {
        for(int i = 0; i < 9; i++) {
            note[i] = 0;
        }
    }
    public int getNum() {
        return num;
    }
    public int[] getNote() {
        return note;
    }
}
