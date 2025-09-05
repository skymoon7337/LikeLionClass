package makes.m1_playoff_games;

public class Two implements Player {
     private final boolean[] opponentHistory;
     private int recordIndex = 0;

     public Two(int maxRounds) {
          this.opponentHistory = new boolean[10];
     }

     @Override
     public boolean cooperate(int round) {
          // 1라운드에 배신 → 이후는 Tit‑for‑Tat
          if (round == 1) {
               return false;
          } else if (round == 10) {
               return false;
          }else {
               return opponentHistory[round - 2];
          }


     }

     @Override
     public void recordOpponentMove(boolean opponentMove) {
          opponentHistory[recordIndex++] = opponentMove;
     }
}
