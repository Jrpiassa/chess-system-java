package chess;

import boardgame.Position;
import utils.Mensagens;

public class ChessPosition {
	private char colunm;
	private int row;
	private static final char INICOLUNAXADREZ = 'a';
	private static final char FIMCOLUNAXADREZ = 'h';
	private static final int INILINHAXADREZ = 1;
	private static final int FIMLINHAXADREZ = 8;

	public ChessPosition(char colunm, int row) {
		validaLinhaColuna(colunm, row);
		this.colunm = colunm;
		this.row = row;
	}

	public char getColunm() {
		return colunm;
	}

	public int getRow() {
		return row;
	}

	private void validaLinhaColuna(char colunm2, int row2) {
		if (colunm2 < INICOLUNAXADREZ || colunm2 > FIMCOLUNAXADREZ || row2 < INILINHAXADREZ
				|| row2 > FIMLINHAXADREZ) {
			throw new ChessException(Mensagens.POSICAODEXADREZINVAIDA.getMsg());
		}

	}

	protected Position toPosition() {
		return new Position(8 - this.row, this.colunm - INICOLUNAXADREZ);
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) (INICOLUNAXADREZ - position.getColunm()), FIMLINHAXADREZ - position.getRow());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.colunm + ";"+ this.row;
	}

}
