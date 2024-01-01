package ObjectOriented.HeiMa.ExtendDemo;

public class Java04 {
    public static void main(String[] args) {
        //子类构造方法中隐藏的super()去访问父类的无参构造
        SonDemo s = new SonDemo("xys", 12);
        System.out.println(s.name);
        // 子类不能继承父类的构造方法，但是可以通过super访问
        // 子类构造方法的第一行有一个默认的super()
        // 默认先访问父类中无参的构造方法，再执行自己
    }
}
class FatherDemo {
    String name;
    int age;

    public FatherDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class SonDemo extends FatherDemo{
    public SonDemo(String name, int age) {
        super(name, age);
    }
}
