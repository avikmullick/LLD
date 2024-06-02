package snakeandladder;

public class Player {

    private String playerName;

    private Cell currPos;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Cell getCurrPos() {
        return currPos;
    }

    public void setCurrPos(Cell currPos) {
        this.currPos = currPos;
    }
}
