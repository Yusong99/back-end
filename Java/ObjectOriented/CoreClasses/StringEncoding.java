package ObjectOriented.CoreClasses;

import java.util.Arrays;

public class StringEncoding {
    public static void main(String[] args) {
        //extractSubstring("xuyusong");//yusong     yu
        //isEmptyBlank(" ");//false
        //replaceString("xuyusong");//xxyxsong   flyusong
        //splitString("x,y,s,f,l,x");//[x, y, s, f, l, x]
        //joinString(new String[] {"x", "y", "s"});//x***y***s
        typeChanged();
    }

    static void stringDefinition(String s1, String s2) {
        //String s1 = "hello";
        //String s2 = new String(new char[] {'h','e','l','l','o'});
        System.out.println(s2); //hello
        s2 = s2.toUpperCase();//转换成大写
        System.out.println(s2);//HELLO
        //s2 = s2.toLowerCase();
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2)); //比较字符串内容是否相同使用equals false

        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写比较 true
    }

    static void compareString(String s1, String s2) {
        //String s1 = "hello";
        //String s2 = new String(new char[] {'h','e','l','l','o'});
        System.out.println(s2); //hello
        s2 = s2.toUpperCase();//转换成大写
        System.out.println(s2);//HELLO
        //s2 = s2.toLowerCase();
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2)); //比较字符串内容是否相同使用equals false

        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写比较 true
    }

    static void searchSubstring(String s) {
        //index from zero
        //String s = "Hello, world!";
        System.out.println(s.contains("123")); //false
        System.out.println(s.indexOf("l"));//2
        System.out.println(s.lastIndexOf("l"));//10  blank also takes up one character
        System.out.println(s.startsWith("He"));//true
        System.out.println(s.endsWith("ld!"));//true
    }

    static void extractSubstring(String s) {
        //String s = "hello"
        System.out.println(s.substring(2));//"llo"
        System.out.println(s.substring(2, 4));//"ll"
    }

    static void removeBlank(String s) {
        // \t \r \n are blank strings
        //String s = "\tHello\r\n";
        s.trim();//only return new blank string
        System.out.println(s);
        System.out.println(s.trim());
        //还有个strip（）：用来去除字符串的前导和后缀空格,懒得写了，I'm too lazy to write
    }

    static void isEmptyBlank(String s) {
        //"".isEmpty(); // true，因为字符串长度为0
        //"  ".isEmpty(); // false，因为字符串长度不为0
        //"  \n".isBlank(); // true，因为只包含空白字符
        //" Hello ".isBlank(); // false，因为包含非空白字符
        System.out.println(s.isEmpty());
    }

    static void replaceString(String s) {
        //String s = "hello";
        //s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        //s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        //另一种是通过正则表达式替换：
        //String s = "A,,B;C ,D";
        //s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"

        System.out.println(s.replace('u', 'x'));
        System.out.println(s.replace("xu", "fl"));
    }

    static void splitString(String s){
        String[] ss = s.split("\\,");
        System.out.println(Arrays.toString(ss));
    }

    static void joinString(String[] s){
        //String[] ss ={"x", "y", "z"};
        System.out.println(String.join("***",s));
    }

    static void typeChanged(){
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        System.out.println(String.valueOf(new Object()));//java.lang.Object@4eec7777
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        char[] cs = "Hello".toCharArray(); // String -> char[]
        String s = new String(cs); // char[] -> String
    }


}
