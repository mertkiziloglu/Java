package Java.Entity.concreretes;

public class Game {
    int gameId;
    String gameName;
    int gameMaxLevel;

    public Game() {
    }

    public Game(int gameId, String gameName, int gameMaxLevel) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameMaxLevel = gameMaxLevel;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameMaxLevel() {
        return gameMaxLevel;
    }

    public void setGameMaxLevel(int gameMaxLevel) {
        this.gameMaxLevel = gameMaxLevel;
    }
}
