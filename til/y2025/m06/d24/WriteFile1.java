package til.y2025.m06.d24;

import java.io.FileWriter;
import java.io.IOException;


public class WriteFile1 {
    public static void writeFile(String filename,String content) {
        FileWriter writer = null;

        try{
            writer=new FileWriter(filename);
            writer.write(content);
        } catch(IOException e){
            e.printStackTrace();
        } finally{
            try{
                if (writer !=null) writer.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        writeFile("lunch-menu.txt","오늘 점심은?");
        System.out.println("파일 생성 완료");
    }
}
