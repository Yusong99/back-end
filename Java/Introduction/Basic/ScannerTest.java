package Introduction.Basic;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name");//next()用于字符串等
        String name = sc.next();
        System.out.println("age");
        int age = sc.nextInt();
        System.out.println("gender");
        String gender = sc.next();
        System.out.println("height");
        double height = sc.nextDouble();
        System.out.println("married");
        String married = sc.next();
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(married);
        System.out.println("注册成功！");
        System.out.println("年龄是："+age+"性别是："+gender);//年龄是：19性别是：男
    }
}
