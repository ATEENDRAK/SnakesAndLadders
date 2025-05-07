import Entity.*;

import java.util.ArrayList;
import java.util.List;


/*
New requirements:

* Number of players more than 2. - 0;
* Other than snake & ladder
	* Board has coins now. or Xp.
		Coins - 2 class changes and 1 addition. -> 2 changes reduced to 1.
	* Dragon - make you die
	* Butterfly -> fly you to 0.
	* Snake has more than one mouth.
	* You dont need ladder/snake/coins.
* Ordering of players - other than round robin. -> 1 -> 0
	* Skipping died players.
* Winning by moving to 100 and min 10 coins.
* Instead of 0, start with some other position.
	* Variable for different players.

* More dimensions to the board.
* Dice size can be more than 6. Or instead of 1 dice, you throw 2 dices.
	* More rules for dice, if get 6, another chance.
* Skip your turn.
 */

public class Main {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        List<IBoardEntity> iBoardEntities;
        for(int i = 0; i<=100; i++){
            boxes.add(new Box(i));
        }
        IBoardEntity snake1 = new Snake(boxes.get(82), boxes.get(28));
        IBoardEntity ladder1 = new Ladder(boxes.get(19), boxes.get(91));
        IBoardEntity coin1 = new Coin(boxes.get(20), 40);
        IBoardEntity coin2 = new Coin(boxes.get(40), 25);
        List<IBoardEntity> iBoardEntityList = new ArrayList<>();
        iBoardEntityList.add(snake1);
        iBoardEntityList.add(ladder1);
        iBoardEntityList.add(coin1);
        iBoardEntityList.add(coin2);
        Board board = new Board(boxes, iBoardEntityList);
        Player player1 = new Player("blue" ,0);
        Player player2 = new Player("red", 0);
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Dice dice = new Dice(6);
        IWinningStrategy iWinningStrategy = new DeafultWinningStrategy();
        IPlayerStartingPositionStrategy iPlayerStartingPositionStrategy = new DefaultPlayerStartingPositionStrategy(boxes.getFirst());
        IFindNextPlayerStrategy iFindNextPlayerStrategy = new RoundRobinFindNextPlayerStrategy();
        Game game = new Game(board, players, dice, iWinningStrategy, iPlayerStartingPositionStrategy, iFindNextPlayerStrategy);
        game.run();
        System.out.println("Hello, World!");
    }
}