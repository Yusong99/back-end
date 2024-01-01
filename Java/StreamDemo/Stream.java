package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","", "adb", "asd");
        List<String> filter = strings.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println(filter);
    }
}
