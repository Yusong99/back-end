package LambdaDemo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        /* 小括号对应方法的形参 大括号对应方法的方法体
        * 注意：：Lambda表达式可以用来简化匿名内部类的书写
        * Lambda表达式只能简化函数式接口的匿名内部类的写法
        * 函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@Functionainterface注解 */
        Integer[] arr = {2, 3, 1, 2, 1};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 -o2;
        });
        System.out.println(Arrays.toString(arr));
    }
}
