package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	/**
	 * Metodo abstrato que retorna a matriz com os possiveis movimentos de uma peca
	 * @return
	 */
	public abstract boolean[][] possibleMoves();
	
	/**
	 * Metodo que retorna se é possivel mover uma peca em uma posicao especifica da matriz
	 * @param position
	 * @return
	 */
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	/**
	 * Metodo que retorna se uma peca esta travada, sem possibilidade de se mover	
	 * @return
	 */
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
