package til.y2025.m06.d13;

class AdultPerson{
     private String name;
     private int age;

     public String getname(){
          return name;
     }

     public void setName(String name){
          this.name=name;
     }

     public int getAge(){
          return age;
     }

     public void setAge(int age){
          if (age < 18) {
               System.out.println("성인만 가입 가능.");
          } else{
               this.age=age;
          }
     }


}


public class GetterSetter {
    public static void main(String[] args) {
         AdultPerson person=new AdultPerson();

        // person.name="하늘";
         person.setName("하늘");

         //System.out.println(person.name);
         System.out.println(person.getname());
    }
}
