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
		start();
	}
	
	public void start() {
		while(true) {
			move();
			System.out.println(board.toString());
		}
	}
	
	public void move() {
		System.out.println("Player " + turn.getToken() + "'s turn.");
		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		System.out.print("Enter O;");
		int o = scanner.nextInt();
		
		if (board.placeCharacter(turn.getToken(), x, o)) {
			
			switchTurn();
		} else {
			System.out.println("Please choose a valid move.");
		}
	}
	
	private void switchTurn() {
		turn = (turn == player1 ? player2 : player2); 
	}
}
