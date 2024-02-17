package MyThread;

public class ThreadTest {
    public static void main(String[] args) {
        // ThreadDemo threadDemo = new ThreadDemo();
        // ThreadDemo threadDemo1 = new ThreadDemo();
        // threadDemo.setName("thread one");
        // threadDemo1.setName("thread two");
        // threadDemo.start();
        // threadDemo1.start();

        // 创建MyRun对象
        // 表示多线程要执行的任务
        // MyRun mr = new MyRun();
        // 创建线程对象
        // Thread t1 = new Thread(mr);
        // Thread t2 = new Thread(mr);
        // t1.setName("runnable1");
        // t2.setName("runnable2");
        // 开启线程
        // t1.start();
        // t2.start();

        ThreadSecurity t1 = new ThreadSecurity();
        ThreadSecurity t2 = new ThreadSecurity();
        t1.setName("T1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
