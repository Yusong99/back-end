package APIs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ObjectAPIs {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));
        // 字符串中的equal方法会先判断是否为字符串，如果是再比较，否则直接返回false

        System.out.println(sb.equals(s));
        // StringBuilder没有重写equals方法，是直接继承自Object中的
        // 而Object中默认是使用==比较两个对象的地址值
        Integer[] arr = {1, 2, 3,2,1};
        int[] arr2 = {2, 3};
        Arrays.sort(arr, (Integer a, Integer b)->{
            return a - b;
        }
        );
        System.out.println(Arrays.toString(arr));
    }
}

interface Swim{
    public void swim();
}
