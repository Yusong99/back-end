package ObjectOriented.InnerClass;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
//        System.out.println(engineName); // 外部类无法获取内部类的成员变量
    }

      class Engine{
         String engineName;
         int engineAge;
         public void show() {
             // 内部类可以直接访问外部类的成员，包括私有
             System.out.println(engineName);
             System.out.println(carName);
         }
     }
}
