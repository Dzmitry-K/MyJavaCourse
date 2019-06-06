/**
 * Напишите программу, которая в несколько потоков скачивает файлы по заданному списку URL-адресов.
 * Скачать файл можно например так:
 * BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())
 */

package _7_concurrent._hw._hw_1;

import java.io.*;

public class DownloadFiles implements Runnable{

    private static final String PATH = "/home/qwe/11111/";
    private final String url;
    private final String fileName;

    public DownloadFiles(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {

        File copied = new File(url+fileName);
        try (
                InputStream in = new BufferedInputStream(new FileInputStream(PATH));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(copied))
            ) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while((lengthRead = in.read(buffer)) > 0 ) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


