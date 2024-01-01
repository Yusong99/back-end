package ObjectOriented.HeiMa.staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo();
        StudentDemo s2 = new StudentDemo();
        StudentDemo s3 = new StudentDemo();
        s1.setTeacher("xys");
        System.out.println(s2.getTeacher()); // xys, 不加static就是null
    }
}
