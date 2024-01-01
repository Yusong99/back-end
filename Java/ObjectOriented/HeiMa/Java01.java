package ObjectOriented.HeiMa;

public class Java01 {
    /*
    * 成员变量，成员方法，构造器，代码块，内部类*/
    public static void main(String[] args) {
        Phone redmi = new Phone();
        redmi.call();
    }
}

class Phone {
    String brand;
    int price;
    public  void call() {
        System.out.println("Call");
    }
}
