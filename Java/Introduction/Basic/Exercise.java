package Introduction.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(Equation(1.0, 3.0, -4.0)[0]);
        System.out.println(Equation(1.0, 3.0, -4.0)[1]);
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
        System.out.println(Arrays.toString(FixMe()));//[Hi！, Hi！]
        StringArr();
        Score();
    }

    public static double[] Equation(double a, double b, double c) {
        //Find two solutions to a quadratic equation in one variable
        // square rooting Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        double r1;
        double r2;
        double num1 = b * b - 4 * a * c;
        double num2 = Math.sqrt(num1);
        r1 = (-b + num2) / (2 * a);
        r2 = (-b - num2) / (2 * a);
        return new double[] {r1, r2};
    }

    public static String[] FixMe() {
        //请将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        String s1 = String.format("%c%c%c", a, b, c);
        String s2 = "" + (char)a + (char)b + (char)c;
        //System.out.println(s);
        return new String[] {s1, s2};
    }

    public static void StringArr() {
        //explain why is XYS
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // XYZ
    }

    public static void Score() {
        //请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your last examination score?");
        int lScore = scanner.nextInt();
        System.out.print("Input your this examination score?");
        int tScore = scanner.nextInt();
        double percent = (double)(tScore - lScore) /lScore * 100;
        System.out.printf("percent:%.2f%%\n",percent);
    }
}
