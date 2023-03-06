public class Go {
    private int[][] board;
    private int turn;
    private final int EMPTY = 0;
    private final int BLACK = 1;
    private final int WHITE = 2;

    public Go() {
        board = new int[19][19];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = EMPTY;
            }
        }
        turn = BLACK; 
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == EMPTY) {
                    System.out.print("-");
                } else if (board[i][j] == BLACK) {
                    System.out.print("B");
                } else if (board[i][j] == WHITE) {
                    System.out.print("W");
                }
            }
            System.out.println();
        }
    }

    public void makeMove(int x, int y) {
        if (board[x][y] != EMPTY) {
            System.out.println("Illegal move. Space is already occupied.");
            return;
        }

        if (turn == BLACK) {
            board[x][y] = BLACK;
            turn = WHITE;
        } else {
            board[x][y] = WHITE;
            turn = BLACK;
        }
    }
}