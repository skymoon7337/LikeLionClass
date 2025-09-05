package makes.m1_playoff_games;

import java.util.Random;

public class B implements Player {
     final Random rand = new Random();

     @Override
     public boolean cooperate(int round) {
          return rand.nextBoolean();
     }

     @Override
     public void recordOpponentMove(boolean opponentMove) {
     }

}
