package makes.m1_playoff_games;

public interface Player {
    boolean cooperate(int round);

    void recordOpponentMove(boolean opponentMove);
}
