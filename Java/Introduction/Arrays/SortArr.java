package Introduction.Arrays;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        bubbleSort();
        innerSort();
    }

    public static void bubbleSort(){
        //冒泡排序
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length; i++) {
            for (int j = 1; j < ns.length - i; j++) {//optimization:j<ns.length-i  because 'i' has calculated
                if (ns[j-1]>ns[j]){
                    int temp = ns[j-1];
                    ns[j-1] = ns[j];
                    ns[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }

    public static void innerSort(){
        //内置的排序
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}
