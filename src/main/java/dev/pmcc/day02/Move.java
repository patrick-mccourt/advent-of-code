package dev.pmcc.day02;

public enum Move {
    ROCK (1), PAPER(2), SCISSORS(3);
    private int points;

    Move(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
