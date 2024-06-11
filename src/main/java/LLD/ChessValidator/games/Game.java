package LLD.ChessValidator.games;

public abstract class Game {
    final String name;

    public Game(String name) {
        this.name = name;
    }

    public void printGameName() {
        System.out.println("Starting Game: " + name);
    }

    abstract void initGame();
}
