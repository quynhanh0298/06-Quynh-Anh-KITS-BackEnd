package tic_tac_toe;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Lisa");
        Player p2 = new Player("Rose");

        Game game = new Game(p1, p2);
        game.go();
    }
}
