package boardgame;

public class Position {
	private int row;
	private int colunm;
	
	public Position(int row, int colunm) {
		this.row = row;
		this.colunm = colunm;
	}

	public int getRow() {
		return row;
	}	

	public int getColunm() {
		return colunm;
	}

	public void setValues(int row, int colunm) {
		this.row = row;
		this.colunm = colunm;
	}
	
	@Override
	public String toString() {
		return this.row + " , "+ this.colunm;
	}
	
	
	

}
