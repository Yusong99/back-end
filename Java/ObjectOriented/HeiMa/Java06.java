package ObjectOriented.HeiMa;

import java.util.Scanner;

public class Java06 {
    public static void main(String[] args) {
        // StringBuilder
        // 一个容器，里面的内容是可变的
        // Java做了特殊处理，打印的时候是属性值不是地址值
        StringBuilder str = new StringBuilder();
        // append的返回值还是StringBuilder对象
        str.append("123").append("123");
        Scanner sc = new Scanner(System.in);
        str.append(sc.next());
        // 把stringBuilder变回字符串
        System.out.println(str.toString());
        System.out.println(str.length());
        System.out.println(str.reverse().toString());

        // 场景：字符串拼接；字符串反转
    }
}
