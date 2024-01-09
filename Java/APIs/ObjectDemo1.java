package APIs;

public class ObjectDemo1 {
    public static void main(String[] args) {
        // object 是顶级父类
        System.out.println(123);
        //string中的equals方法会先比较是不是字符串，如果是再去比较，如果不是就直接返回false
        //Object中的equals比较的是对象的地址值，StringBuilder没有equals是直接用的Object中的
    }
}
