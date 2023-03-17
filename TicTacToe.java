class TicTacToe {

    private final int boardLength = 3;
    private final String emptyCell = " E ";
    private final String X = " X ";
    private final String O = " O "; 
    private String whoseTurn = " X ";
    private boolean isTie = false;
    private boolean isFinished = false;
    private String getWinner = null;

    private String[][] board = new String[boardLength][boardLength];

    TicTacToe() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }

        whoseTurn = X;
    }

    private void changeTurn() {
        if (whoseTurn == X) {
            whoseTurn = O;
        } else {
            whoseTurn = X;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength
            || x < 0 
            || y >= boardLength 
            || y < 0) {
                System.out.println("invalid coordinate x: " + x + "y: " + y);
            } 

        if (board[x][y] != emptyCell) {
            System.out.println("invalid move. cell not empty");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    public void printBoard() {
        System.out.println("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public boolean isTie() {
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                if (board[i][j].equals(emptyCell)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getWinner() {
        String[] players = {X, O};
        for (String player : players) {
 
            for (int i = 0; i < boardLength; i++) {
                if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                    return player;
                }
            }

            for (int j = 0; j < boardLength; j++) {
                if (board[0][j].equals(player) && board[1][j].equals(player) && board[2][j].equals(player)) {
                    return player;
                }
            }

            if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
                return player;
            }
            if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
                return player;
            }
        }
        return null;
    }
    public boolean isFinished() {
        if (getWinner() != null) {
            return true;
        }
        return false;
    }
}



