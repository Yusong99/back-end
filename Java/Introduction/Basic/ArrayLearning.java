package Introduction.Basic;

import java.util.Arrays;

public class ArrayLearning {
    public static void main(String[] args) {
        //definition
        int[] num1 = new int[] {4,8,15}; // 完整格式
        String[] str = {"x","y","s"};

        String[] chn = new String[] {"chinese","japan"};

        //for-each
        int[] num = {1,8,5,4,98,54};
        for (int n : num) {
            System.out.println(n);
        }

        int[] ns = {1, 6,8,5};
        System.out.println(Arrays.toString(ns));

        int[][] ns1 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(ns1));

        // 数组容器在存储数据的时候要结合隐式转换考虑
        // int类型的数组容器可以存储byte short int 不能
        // 存储boolean double 而double类型数组就都可以

        double[] arrTest = new double[10];
        int numTest = 5;
        arrTest[0] = numTest;
        System.out.println(arrTest[0]);

        //直接输出数组
        int[] arr = {1,2,3};
        System.out.println(arr); // [I@7a81197d
        // @:表示一个间隔符号（固定格式）
        // [:表示当前是一个数组
        // I:表示当前数组里面的元素都是int类型的

        char[] c = new char[3];
        System.out.println(c[0]);// 字符型数组默认值为/u0000 空格
    }
}
