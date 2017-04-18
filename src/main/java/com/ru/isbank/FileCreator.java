package com.ru.isbank;

import java.io.File;
import java.io.IOException;

/**
 * Created by sk10271 on 17.04.2017.
 */
public class FileCreator extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            File file = new File("C:\\Temp\\testJavaFiles\\" + i / 3 * System.currentTimeMillis() + ".txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
