package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import userinterface.UI;
import utils.Mensagens;

public class Program {

	public static void main(String[] args) {
		System.out.println("********  Welcome to Chess Match!  ********\n");
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				
				System.out.println();			
				System.out.print(Mensagens.SOURCE.getMsg());			
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();			
				System.out.print(Mensagens.TARGET.getMsg());			
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece pecaCapturada = chessMatch.performChessMove(source, target);
				
			} catch (ChessException | InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
			
		}

	}

}
