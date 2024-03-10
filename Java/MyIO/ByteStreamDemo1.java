package MyIO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ByteStreamDemo1
 */
public class ByteStreamDemo1 {

    public static void main(String[] args) throws IOException {
        // 本地文件
        FileOutputStream fos = new FileOutputStream("./MyIO/demo1.txt");
        // 写出数据
        fos.write(98);
        // 释放资源
        fos.close();
    }
}