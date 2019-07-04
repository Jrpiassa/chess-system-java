package application;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		System.out.println("Welcome to the game!");
		
		Position position = new Position(3, 2);
		
		System.out.println(position);
		
		position.setValues(1, 4);
		
		System.out.println(position);

	}

}
