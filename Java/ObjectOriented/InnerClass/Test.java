package ObjectOriented.InnerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.carName = "特斯拉";
        car.carAge = 18;
        car.carColor = "red";
        car.show();
        // 创建静态内部类的对象
        // 只要是静态的东西，都可以用类名点直接获取
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        Outer.Inner.show2();
    }
}
