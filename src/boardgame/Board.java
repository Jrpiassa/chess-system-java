package boardgame;

import utils.Mensagens;

public class Board {

	private int rows;
	private int colunms;
	private Piece[][] pieces;

	public Board(int rows, int colunms) {

		if (rows < 1 || colunms < 1) {
			throw new BoardException(Mensagens.LINHAECOLUNAMAIORQUEZERO.getMsg());
		}

		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	public int getRows() {
		return rows;
	}

	public int getColunms() {
		return colunms;
	}

	public Piece piece(int row, int colunm) {

		if (!positionExists(row, colunm)) {
			throw new BoardException(Mensagens.POSITIONNOTONTHEBOARD.getMsg());
		}

		return pieces[row][colunm];
	}

	public Piece piece(Position position) {

		if (!positionExists(position)) {
			throw new BoardException(Mensagens.POSITIONNOTONTHEBOARD.getMsg());
		}

		return pieces[position.getRow()][position.getColunm()];
	}

	public void placePeace(Piece piece, Position position) {

		if (thereIsAPiece(position)) {
			throw new BoardException(Mensagens.JAEXISTEUMAPECANESTAPOSICAO.getMsg() + position);
		}

		pieces[position.getRow()][position.getColunm()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int col) {
		return row >= 0 && row < rows && col >= 0 && col < colunms;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColunm());
	}

	public boolean thereIsAPiece(Position position) {

		if (!positionExists(position)) {
			throw new BoardException(Mensagens.POSITIONNOTONTHEBOARD.getMsg());
		}

		return piece(position) != null;
	}

}
