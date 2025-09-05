package makes.m1_playoff_games;

public class TwoSky implements Player {
     final boolean[] opponentHistory;
     int recordIndex = 0;

     public TwoSky(int maxRounds) {
          this.opponentHistory = new boolean[10];
     }

     //TFT를 기본으로 상대 배반횟수가 2회 이상일때 무자비복수 하게 설계했어요.
     //협력 2회시작인데도 상대가 배반 2회 이상이면,
     //상대 전략이 기본 TFT가 아니라, 배반 전략인거 같아서 대응할수 있게요.
     //그리고 TFT가 저점이 저점이 가장 높은거 같아서, 그거 아닐때는 TFT로 동작하게 했습니다.
     //팀원분들이 9~10라에 배반하는게 좋아보이신다고 해서 추가

     @Override
     public boolean cooperate(int round) {
          if (round <= 2) { // 2라운드까지는 무조건 협력
               return true;
          }
          if (round == 9 || round == 10) {
               return false; // 9, 10라운드에는 무조건 배반
          }

          int defectCount = 0;  // 상대의 배반 횟수 세기 / false = 배반

          for (int i = 0; i < round - 1; i++) {
               if (!opponentHistory[i]) {
                    defectCount++;
               }
          }

          if (defectCount >= 2) {  // 상대가 총 2번 이상 배반
               return false;
          }


          return opponentHistory[round - 2];  // 총 2회 이상 배반 없으면 TFT
     }

     @Override
     public void recordOpponentMove(boolean opponentMove) {
          opponentHistory[recordIndex++] = opponentMove;
     }
}

