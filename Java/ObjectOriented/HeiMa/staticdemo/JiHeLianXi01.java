package ObjectOriented.HeiMa.staticdemo;

import java.util.ArrayList;

public class JiHeLianXi01 {
    public static void main(String[] args) {
        // 存储自定义类型
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("xys", 18);
        Student s2 = new Student("flx", 18);
        Student s3 = new Student("xx", 18);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list.get(0).getAge());
        System.out.println(getYourName(list));
    }
    public static String getYourName(ArrayList<Student> list) {
        return list.get(0).getAge().getName();
    }
}
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student getAge() {
        return this;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
