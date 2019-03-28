package lesson18;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("/Users/mac/Desktop");
        System.out.println(dir.isFile());

        if (!dir.exists()){
            try {
                dir.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
