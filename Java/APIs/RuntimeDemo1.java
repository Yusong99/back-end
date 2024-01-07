package APIs;

public class RuntimeDemo1 {
    public static void main(String[] args) {
//        java.lang.Runtime r1 = java.lang.Runtime.getRuntime();
//        System.out.println(r1.maxMemory() / 1024 / 1024);
        // 获取Runtime的对象
//        Runtime r1 = Runtime.getRuntime();
        // exit 停止虚拟机
//        r1.exit(0);
//        Runtime.getRuntime().exit(0);
        // 监控虚拟机
        // 获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 获取可用的内存数
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024/1024);
        // 已经获取的内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        // 剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println("Is run?");
    }
}
