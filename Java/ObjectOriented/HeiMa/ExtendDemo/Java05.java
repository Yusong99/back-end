package ObjectOriented.HeiMa.ExtendDemo;

public class Java05 {
    public static void main(String[] args) {
        Animal animal = new DogDemo();
        animal.eat();
//        animal.look();
        /*
        * 多态的弊端
        * 不能调用子类的特有功能
        * 当调用成员方法时编译看左边，运行看右边
        * 那么在编译的时候会先检查左边的父类中有没有这个方法，没有的话直接报错*/
    }
}
class Animal{
    public void eat() {
        System.out.println("animal");
    }
}

class DogDemo extends Animal{
    @Override
    public void eat() {
        System.out.println("dog");
    }
    public void lookHome() {
        System.out.println("look");
    }
}

