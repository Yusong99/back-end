package APIs;

public class CloneDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo1 cloneDemo1 = new CloneDemo1(1, "xys", "123", "/123");

        CloneDemo1 clone = (CloneDemo1) cloneDemo1.clone();
        // 通过在类中写toString方法可以改变println的输出方式
        System.out.println(clone);
        System.out.println(cloneDemo1);
    }
}
