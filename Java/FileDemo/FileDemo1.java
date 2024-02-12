package FileDemo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        // 根据字符串表示的路径，变成File对象
        String str = File.separator + "a.txt";
        File file = new File(str);
        System.out.println(file);
        file.createNewFile();
    }
}
