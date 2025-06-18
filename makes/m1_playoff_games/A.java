package makes.m1_playoff_games;

public class A implements Player {
    final boolean[] opponentHistory;
    int recordIndex=0;

    public A(int maxRounds){
        this.opponentHistory= new boolean[10];
    }

    //round 1,2,3...
    //index 0,1,2...
    @Override
    public boolean cooperate(int round) {
        if(round==1) {
            return true;
        }
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++]=opponentMove;
    }
}
