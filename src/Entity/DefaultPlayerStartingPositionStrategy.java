package Entity;

public class DefaultPlayerStartingPositionStrategy implements IPlayerStartingPositionStrategy{
    Box playerStartingPosition;

    public DefaultPlayerStartingPositionStrategy(Box playerStartingPosition) {
        this.playerStartingPosition = playerStartingPosition;
    }

    @Override
    public void setStartingPosition(Player player) {
         player.currentPosition = playerStartingPosition;
    }
}
