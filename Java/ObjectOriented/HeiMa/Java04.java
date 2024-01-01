package ObjectOriented.HeiMa;

public class Java04 {


    public static void main(String[] args) {
        // 字符串
        // 直接赋值获取字符串对象
        // 系统会检查该字符串在串池中是否存在，存在就复用，不存在就创建新的，节约内存
        String s1 = "abc";
        String s = "aBc";
        System.out.println(s1.equals(s));
        // equalsignoreCases 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s));
        // 使用new方法来获取一个字符串对象
        // 重新创建，不复用
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //有参构造
        String s3 = new String("abc");
        System.out.println(s3);

        // 字符数组, 一般用于改变字符串
        char[] chs = {'a' ,'b' , 'c'};
        String s4 = new String(chs);
        System.out.println(s4);

        // 字节数组(先去ascii表里查再看是哪一个)，用于网络当中传输数据，
        // 要把字节信息转成字符串
        byte[] bys = {97,98,99,100};
        String s5 = new String(bys);
        System.out.println(s5);


    }
}
