package til.t20250605;

public class BreakContinueQuiz {
    public static void main(String[] args) {
         for (int i=1;i<=30;i++){
             if (i==20){
                 break;
             }
              if (i%6==0){
                  continue;
              }
             System.out.println(i);
         }

    }
}
