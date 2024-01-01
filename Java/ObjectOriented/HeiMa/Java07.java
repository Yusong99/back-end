package ObjectOriented.HeiMa;

import java.util.StringJoiner;

public class Java07 {
    public static void main(String[] args) {
        // StringJoiner,提高字符串操作效率
//        StringJoiner stringJoiner = new StringJoiner(",");
//        stringJoiner.add("123").add("321");
//        System.out.println(stringJoiner.toString());

        StringBuilder str = new StringBuilder();
        System.out.println(str.capacity());

        char[] ch = {'1','2','3'};
        System.out.println(ch);
    }
}
