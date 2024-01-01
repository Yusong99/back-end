package APIs;

public class Runtime {
    public static void main(String[] args) {
        java.lang.Runtime r1 = java.lang.Runtime.getRuntime();
        System.out.println(r1.maxMemory() / 1024 / 1024);
    }
}
