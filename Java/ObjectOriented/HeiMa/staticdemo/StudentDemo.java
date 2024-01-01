package ObjectOriented.HeiMa.staticdemo;

public class StudentDemo {
    private static String teacher;
    // 静态变量被该类所有对象共享
    // 调用方式：推荐类名调用，或者对象名调用
    private String name;
    private int age;

    public String getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
