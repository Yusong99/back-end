package Introduction.ProcessControl;//14:28 27/2/2023
//23:42 27/2/2023
//21:05 28/2/2023

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int x = 18;
        // if else
        if (x > 10 && x <= 20) { // 11-20
            System.out.println("Introduction.Basic.Hello");
            System.out.println("xtys");
        } else
            System.out.println("Bye");

        int a = 6;
        int b = 7;
        if (a < b) {
            System.out.println("xty");
        }

        if (a > b && b > x) {
            System.out.println("flx"); // false
        } else if (a < b || b < x) {
            System.out.println("love"); // true
        } else {
            System.out.println("xysflx"); // false
        }

        int n = 4;
        int result = 0;

        // ternary operator
        // if(n%2 == 0)
        // result =10;
        // else
        // result = 20;
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);

        // switch statement
        int f = 8;
        switch (f) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }

        int opt = switch (f) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> 4;
            case 5 -> 5;
            case 6 -> 6;
            case 7 -> 7;
            default -> {
                yield 520;
            }
        };
        System.out.println(opt);
        SwitchTest();
    }

    public static void SwitchTest(){
        // Switch case后面的值不允许重复
        // case 后面的值只能是字面量，不能是变量
        //switch（）中可以接收的类型，1）基本数据类型byte short char int
        //2) 引用数据类型，枚举，String
        //case 穿透现象,上一个符合的条件要是没有break会穿透执行到下一个case
        Scanner sanner = new Scanner(System.in);
        int num = sanner.nextInt();
        //switch (num){
        //    case 1:
        //    case 2:
        //    case 3:
        //    case 4:
        //        System.out.println(4);
        //        break;
        //    case 5:
        //        System.out.println(5);
        //        break;
        //    default:
        //        System.out.println(6);
        //        break;
        //}
        switch (num) {
            case 1,2,3,4-> System.out.println(4);
            case 5-> System.out.println(5);
            default -> System.out.println(6);
        }
    }
}
