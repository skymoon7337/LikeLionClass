package til.y2025.m06.d24;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIO1 {
     public static void writeFile(String filename, String content) {
          Path filePath = Paths.get(filename);

          try (FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
               ByteBuffer buffer = ByteBuffer.allocate(1024);

               buffer.put(content.getBytes());
               buffer.flip();
               writeChannel.write(buffer);
               System.out.println("파일을 성공적으로 작성 완료했습니다.");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }

     public static void readFile(String filename) {
          Path filePath = Paths.get(filename);

          try (FileChannel readChannel = FileChannel.open(filePath, StandardOpenOption.READ)) {
               ByteBuffer buffer = ByteBuffer.allocate(1024);
               int bytesRead = readChannel.read(buffer);

               while (bytesRead != -1) {
                    buffer.flip();

                    String chunk = StandardCharsets.UTF_8.decode(buffer).toString();
                    System.out.print(chunk);

                    buffer.clear();
                    bytesRead = readChannel.read(buffer);
               }
               System.out.println("\n파일 읽기가 완료 되었습니다.");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }

     public static void main(String[] args) {
          readFile("dinner-menu.txt");
     }
}