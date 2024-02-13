package MyThread;

public class MyRun implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        // 书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            // 获取当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "Hello World");
        }
    }
}
