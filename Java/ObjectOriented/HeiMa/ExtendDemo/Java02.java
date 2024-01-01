package ObjectOriented.HeiMa.ExtendDemo;

public class Java02 {
    public static void main(String[] args) {
        // 成员变量  非私有 私有子类都可以继承，但不一定能用
        // 构造方法  父类的构造方法不能被子类继承，因为构造方法需要与类名一致
        // 成员方法  非私有可以，私有不能继承,虚方法能否则不能
        Son s = new Son(); // 在堆中开辟小空间
//        System.out.println(s.gongFu); //error
        s.fn();
        s.fn2();
    }
}
class Fu{
    String name = "xxxF";
    private String gongFu;
    final void fn() {
        System.out.println("123");
    }
}
class Son extends Fu{
    String name = "xxxS";
    void fn2() {
        String name = "xxx";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
