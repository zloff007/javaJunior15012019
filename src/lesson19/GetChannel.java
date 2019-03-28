package lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

    public static void main(String[] args) {

        try{

                    // Запись в файл:
                    FileChannel fc = new FileOutputStream("data.txt").getChannel();
                    fc.write(ByteBuffer.wrap("Немного текста ".getBytes()));
                    fc.close();
                    // Добавление в конец файла:
                    fc = new RandomAccessFile("data.txt", "rw").getChannel();
                    fc.position(fc.size()); // Переходим в конец
                    fc.write(ByteBuffer.wrap("Еще немного".getBytes()));
                    fc.close();
                    // Чтение файла:
                    fc = new FileInputStream("data.txt").getChannel();
                    ByteBuffer buff = ByteBuffer.allocate(1024);
                    fc.read(buff);
                    buff.flip();
                    while(buff.hasRemaining())
                        System.out.print((char)buff.get());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
