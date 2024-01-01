package Method;

public class Java01 {
    public static void main(String[] args) {
        // 方法是程序中最小的执行单元
        playGame();

        // 实参：方法定义中的参数；形参：方法调用中的参数
        add(1,2);

        // 有返回值的方法
        System.out.println(getArea(4.2f, .3f));

        //
    }

    public static void playGame() {
        System.out.println("123123");
    }
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static float getArea(float width, float height) {
        return width*height;
    }
}
