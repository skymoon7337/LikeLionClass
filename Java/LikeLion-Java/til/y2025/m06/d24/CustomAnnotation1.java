package til.y2025.m06.d24;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo1{
    String author();
    String date();
    int version() default 1;
}

@CustomInfo1(author= "h662", date="2025-06-24", version=2)
class Demo {

    @CustomInfo1(author= "h663", date="2025-06-25")
    public void display(){
        System.out.println("Display method executed.");
    }
}

public class CustomAnnotation1 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class<?> demoClass = demo.getClass();

        if (demoClass.isAnnotationPresent(CustomInfo1.class)) {
            CustomInfo1 classInfo1 = demoClass.getAnnotation(CustomInfo1.class);
            System.out.println("[클래스 어노테이션]");
            System.out.println("Author: " + classInfo1.author());
            System.out.println("Date: " + classInfo1.date());
            System.out.println("Version: " + classInfo1.version());
            System.out.println(classInfo1);
        }

        try {
            Method m = demoClass.getMethod("display");

            if (m.isAnnotationPresent(CustomInfo1.class)) {
                CustomInfo1 mi = m.getAnnotation(CustomInfo1.class);
                System.out.println("[메서드 어노테이션]");
                System.out.println("Author: " + mi.author());
                System.out.println("Date: " + mi.date());
                System.out.println("Version: " + mi.version());
                System.out.println(mi);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
