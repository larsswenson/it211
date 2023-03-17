public class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.printBoard();
        board.updateBoard(1, 1);
        board.printBoard();
        board.updateBoard(2, 1);
        board.printBoard();

        if (board.isTie()) {
            System.out.println("Game is a tie.");
        } else if (board.isFinished()) {
            System.out.println("Game is finished. Winner is: " + board.getWinner());
        } else {
            System.out.println("Game is not finished yet.");
        }
    }
}
