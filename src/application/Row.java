package application;

public class Row{
	private Cell[] row = new Cell[9];
	private int[] nums = new int[9];

    public Row() {
        for(int i = 0; i < 9; i++) {
                row[i] = new Cell();
        }
    }
    public Row(Cell[] row, int[] nums) {
    	this.row = row;
    	this.nums = nums;
    }
    
	public Cell[] getRow() {
		return row;
	}
	public int[] rowNums() {
		for(int i = 0; i < 9; i++) {
			if(row[i].getNum() != 0) {
				nums[i] = row[i].getNum();
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
