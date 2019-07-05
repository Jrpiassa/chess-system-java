package chess;

import boardgame.Board;

public class ChessMatch {
	private static final int ROW = 8;
	private static final int COLUNM = 8;
	private Board board;

	public ChessMatch() {
		board = new Board(ROW, COLUNM);
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] matPieces = new ChessPiece[board.getRows()][board.getColunms()];

		for (int i = 0; i < matPieces.length; i++) {
			for (int j = 0; j < matPieces.length; j++) {
				matPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return matPieces;
	}
}
