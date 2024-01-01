package ObjectOriented.CoreClasses;

public class MyStringBuilder {
    public static void main(String[] args) {
        useStringBuilder();
    }
    static void useStringBuilder(){
        StringBuilder sb = new StringBuilder(1024);
        System.out.println(sb.capacity());
        String s = sb.toString();
        System.out.println(s);
    }
}
