package ObjectOriented.HeiMa;

import java.util.ArrayList;

public class Java08 {
    public static void main(String[] args) {
        // 集合
        // 集合-ArrayList
        // 范型：限定集合存储的数据类型
        // 集合只能存引用数据类型，如果要存基本数据类型需要包装
//        ArrayList<String> list = new ArrayList<String>(); // JDK7以前
        ArrayList<String> list = new ArrayList<>(); // JDK以后的写法
        // Java 内部类，已经做了处理，所以打印出来的不是地址，
        // 在展示的时候会拿[] 把所有的数据进行包裹

        //增
        list.add("a"); // 返回是否添加成功，都是true
        list.add("b");
        list.add("c");
        //删
        String str =  list.remove(0); // 根据索引删除,返回被删除的元素
        Boolean b =  list.remove("b"); // 根据内容删除，返回布尔值
        //改
        String res = list.set(0,"d"); // 返回被覆盖的元素
        //查
        System.out.println(list.get(0)); // 获取指定索引元素
        System.out.println(list.size()); // 获取集合长度

        System.out.println(list);
        System.out.println(str);
        System.out.println(b);
        System.out.println(res);
    }
}
