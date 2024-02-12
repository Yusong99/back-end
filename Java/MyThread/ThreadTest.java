package MyThread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo.setName("thread one");
        threadDemo1.setName("thread two");
        threadDemo.start();
        threadDemo1.start();
    }
}
