package Entity;

import java.util.List;

public interface IFindNextPlayerStrategy {
    public Player findNextPlayer(int currentPlayerIndex, List<Player> players);
}
