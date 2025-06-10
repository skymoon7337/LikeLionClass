package til.t20250610;

class ThisCarQuiz {
     String brand;
     int year;

     ThisCarQuiz(String brand,int year) {
         this.brand=brand;
         this.year=year;
     }

     void displayInfo(){
            System.out.println("브랜드 :"+brand+", 연식은 :"+year);
     }
}

public class ClassMakeCarThisQuiz {
    public static void main(String[] args) {
        ThisCarQuiz carinfo= new ThisCarQuiz("아우디",2025);
        carinfo.displayInfo();

    }
}
