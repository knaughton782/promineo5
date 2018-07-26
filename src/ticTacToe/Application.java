package ticTacToe;

public class Application {

	public static void main(String[] args) {
		/*
		 * What do I need?
		 * 		a board
		 * 		players
		 * 		game: manages board and players
		 * 		
		 */
		
//		Board board = new Board();
//		System.out.println(board.toString());
		
		
		Board board = new Board();
		Player x = new Player('X');
		Player o = new Player('O');
		Game game = new Game(board, x, o);
		
		game.start();
	}

}
