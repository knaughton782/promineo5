package ticTacToe;

import java.util.Scanner;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Player turn;
	private Scanner scanner;
	
	
	//constructor
	public Game(Board board, Player player1, Player player2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		scanner = new Scanner(System.in);
		this.turn = player1;
	}
	
	public void move() {
		System.out.println("Player " + turn.getToken() + "'s turn.");
		System.out.print("Enter x: ");
		int x = scanner.nextInt();
		System.out.print("Enter y;");
		int y = scanner.nextInt();
		board.placeCharacter(turn.getToken(), x, y);
		switchTurn();
		
	}
	
	private void switchTurn() {
		turn = (turn == player1 ? player2 : player2); 
	}
}
