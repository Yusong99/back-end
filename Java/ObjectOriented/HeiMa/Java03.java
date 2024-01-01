package ObjectOriented.HeiMa;

public class Java03 {
    // 标准的JavaBean类
    // 类名需要意思明确
    // 成员变量需要使用private
//    提供至少两个构造方法 无参和有参
//    成员方法 get/set

}
class People {
    // 成员变量：类中方法外的变量，堆内存，整个类中有效
    // 局部变量：方法中的变量，栈内存，在当前方法有效
    private String name;
    private int age;
    public People() {}

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
