package Introduction.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        DESC();
        TwoDimensionArray();
        // 获取随机数
        Random r = new Random();
        int randomIndex = r.nextInt(5);
        System.out.println(randomIndex);
    }
    public static void DESC() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        //降序排列
        for (int i = ns.length - 1; i >= 0; i--) {
            //optimization: j>=ns.length - i circulation from end to start
            for (int j = ns.length - 1; j >= ns.length - i; j--) {
                if (ns[j] > ns[j - 1]) {
                    int temp = ns[j - 1];
                    ns[j - 1] = ns[j];
                    ns[j] = temp;
                }
            }
        }

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }

    public static void TwoDimensionArray() {
        //使用二维数组可以表示一组学生的各科成绩，请计算所有学生的平均分：
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        double average = 0;
        int sum  = 0;
//        for (int i = 0; i < scores.length; i++) {
//            for (int j = 0; j < scores[i].length; j++) {
//                average += scores[i][j];
//                sum++;
//            }
//        }
        //optimize
        for (int[] i : scores){
            for(int j : i){
                average += j;
                sum++;
            };
        }
        average /= sum;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
