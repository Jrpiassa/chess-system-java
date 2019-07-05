package application;

import chess.ChessMatch;
import userinterface.UI;

public class Program {

	public static void main(String[] args) {
		System.out.println("********  Welcome to Chess Match!  ********\n");
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
