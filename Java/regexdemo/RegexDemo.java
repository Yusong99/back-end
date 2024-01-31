package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "Java自从九五年问世以来，经历了很多版本，目前用的最多是Java11";
        // pattern 表示正则表达式
        // Matcher 一个文本匹配器，在大字符串中去找匹配的字串
        // 获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        // 获取文本匹配器对象
        Matcher m = p.matcher(str);
        // 拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
