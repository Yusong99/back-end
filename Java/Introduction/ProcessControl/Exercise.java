package Introduction.ProcessControl;

public class Exercise {
    public static void main(String[] args) {
        Pi();
    }

    public static void Pi() {
        /*
        * 圆周率π可以使用公式计算：
        π4=1−13+15−17+19−…4π​=1−31​+51​−71​+91​−…
        请利用for循环计算π：*/
        double pi = 0;
        //double sum = 0;
        //for (double i = 1, j = 0; i < 1000000000; i += 2, j++) {
        //    if (j % 2 == 0) {
        //        sum += 1 / i;
        //    }else {
        //        sum -= 1 / i;
        //    }
        //    pi = sum*4;
        //}
        for (double i = 1; i < 1000000000; i += 4) {
            pi += 4/i;
            pi -= 4/(i + 2);
        }
        System.out.println(pi);
    }
}
