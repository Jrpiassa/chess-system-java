package chess;

import boardgame.Board;
import chess.piece.King;
import chess.piece.Rook;

public class ChessMatch {
	private static final int ROW = 8;
	private static final int COLUNM = 8;
	private Board board;

	public ChessMatch() {
		board = new Board(ROW, COLUNM);
		initialSetup();
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

	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
		placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

		placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
	}

	private void placeNewPiece(char colunm, int row, ChessPiece chessPiece) {
		board.placePeace(chessPiece, new ChessPosition(colunm, row).toPosition());
	}
}
