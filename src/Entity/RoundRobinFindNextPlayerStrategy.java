package Entity;


import java.util.List;

public class RoundRobinFindNextPlayerStrategy implements IFindNextPlayerStrategy {
    @Override
    public Player findNextPlayer(int currentPlayerIndex, List<Player> players) {
        int nextPlayerIndex = (currentPlayerIndex + 1)%players.size();
        return players.get(nextPlayerIndex);
    }
}
