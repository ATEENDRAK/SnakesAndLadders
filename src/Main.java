import Entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        for(int i = 0; i<=100; i++){
            boxes.add(new Box(i));
        }
        Board board = new Board(boxes, null, null);
        Player player1 = new Player("blue" );
        Player player2 = new Player("red");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Dice dice = new Dice();
        Game game = new Game(board, players, dice);
        game.run();
        System.out.println("Hello, World!");
    }
}