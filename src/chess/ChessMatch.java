package chess;

import boardgame.Board;
import boardgame.Position;
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
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		// board.placePeace(new Rook(board, Color.WHITE), new Position(2, 1));
		// board.placePeace(new King(board, Color.BLACK), new Position(0, 4));
		// board.placePeace(new King(board, Color.WHITE), new Position(7, 4));
	}

	private void placeNewPiece(char colunm, int row, ChessPiece chessPiece) {
		board.placePeace(chessPiece, new ChessPosition(colunm, row).toPosition());
	}
}
