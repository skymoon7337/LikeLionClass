package til.y2025.m06.d19;

//// 기존 생성자
//class stringBox {
//    private String content;
//
//    public  stringBox(String content) {
//        this.content = content;
//    }
//}

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }

}

public class GenericCL1 {
    public static void main(String[] args) {
        Box<String> stringBox=new Box<String>("스트링 박스");

        System.out.println(stringBox.getContent());

        stringBox.setContent("실패!");

        System.out.println(stringBox.getContent());

        stringBox.printContent(123);


    }
}
