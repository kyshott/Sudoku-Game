package application;

public class Column{
	private Cell[] col = new Cell[9];
	private int[] nums = new int[9];

    public Column() {
        for(int i = 0; i < 9; i++) {
                col[i] = new Cell();
        }
    }
    public Column(Cell[] col, int[] nums) {
    	this.col = col;
    	this.nums = nums;
    }
    
	public Cell[] getCol() {
		return col;
	}
	public int[] colNums() {
		for(int i = 0; i < 9; i++) {
			if(col[i].getNum() != 0) {
				nums[i] = col[i].getNum();
			}
			else {
				nums[i] = 0;
			}
		}
		return this.nums;
	}
	
	public boolean hasNum(Cell cell) {
		if(cell.getNum() == 0) {
			return false;
		}
		else {
			return true;
		}
	}
}
