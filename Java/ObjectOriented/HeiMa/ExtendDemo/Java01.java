package ObjectOriented.HeiMa.ExtendDemo;

public class Java01 {
    // Java只支持单继承；不支持多继承，但支持多层继承
    // 每个类都直接或间接继承与Object，没有继承类默认就是Object

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.catchMouse();
        dog.drink();
        dog.home();
    }
}
// 权限修饰符
// private 子类就无法访问
// 私有：只能在本类中访问
// 子类只能访问父类中非私有的成员
class Animals {
    public void eat() {
        System.out.println("吃饭");
    }
    public void drink() {
        System.out.println("喝水");
    }
}
class Cat extends Animals{
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animals {
    public void home() {
        System.out.println("拆家");
    }
}
