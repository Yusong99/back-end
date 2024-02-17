package MyThread;

import ObjectOriented.Basic.Object;

public class ThreadSecurity extends Thread {
    static int ticket = 0;
    static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + ticket);
                } else {
                    break;
                }
            }
        }
    }
}
