package LLD.SnakeNLadder.entities;

public class Player {
    private String name;
    private Integer currPosition;

    public Player(String name, Integer currPosition) {
        this.name = name;
        this.currPosition = currPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(Integer currPosition) {
        this.currPosition = currPosition;
    }
}
