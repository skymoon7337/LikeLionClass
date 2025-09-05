package til.y2025.m06.d24;

import java.io.*;

public class WriteFile1 {
    public static void writeFile(String filename,String content) {
        try (FileWriter writer = new FileWriter(filename,true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

    // 파일 생성
    //    writeFile("lunch-menu.txt","\n스테이크");
    //    System.out.println("파일 생성 완료");

    //파일 읽기
        readFile("lunch-menu.txt");
    }
}
