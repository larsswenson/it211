public class GoDemo {
    public static void main(String[] args) {
        Go game = new Go();
        game.printBoard();
        game.makeMove(2, 2);
        game.printBoard();
        game.makeMove(2, 2); // illegal move demo
        game.makeMove(3, 3);
        game.printBoard();
    }
}
