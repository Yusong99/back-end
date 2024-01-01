package Introduction.Basic;

//23:44 23/2/2023
public class DataTypeNext {
    public static void main(String[] args) {
        // first compile the code and then run the code
        // byte b = 127;
        int a = 257;
        byte k = (byte)a;
        System.out.println(k);//result is 1 because 257%256=1

        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);

        // type promotions
        byte b = 10;
        byte c = 30;
        int result = b * c;
        System.out.println(result);
    }

    public static void Exercise() {
        //面试题，指出下列代码错误
        //byte b1 = 3;
        //byte b2 = 4;
        //byte b3 = b1 + b2;
        //b1和b2是两个byte类型，运算的时候会提升为int类型，提升之后就是两个int在运算，运算的结果还是int⭐
        //解法：byte b3 = (byte)(b1 + b2)
        //后半部分
        //下面代码是否能够通过编译
        //byte b = 3+4;
        //可以通过，java存在常量优化机制，在编译的时候就会将3和4两个字面量进行运算，产生的字节码文件：byte b = 7   √
    }
}
