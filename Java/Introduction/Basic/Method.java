package Introduction.Basic;

public class Method {
    /*
     * 方法：一段具有独立功能的代码块，不调用就不执行
     * 格式：
     * public static void 方法名(){
     * 方法体(逻辑代码)
     * }
     * 注意：
     * 1、方法与方法之间是平级，不允许嵌套
     * 2、方法不调用不执行*/
    public static void main(String[] args) {
        cook();
        eat();
        calculate();
    }

    public static void eat() {
        System.out.println("Welcome");
    }

    public static void cook() {
        System.out.println("cooking...");
    }

    public static void calculate() {
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
    }
}
