package Introduction.Basic;

public class TypeConversion {
    public static void main(String[] args) {
        //隐式转换，将取值范围小的数据或变量给取值范围大的变量赋值，可以直接赋值
        //虽然float占用四个字节但是取值范围比long更大一些，因为小数的二进制存储形式更加节省内存
        int a =10;
        double b = a ;
        System.out.println(a);
        System.out.println(b);
        //byte short char 三种运算会先转换为int类型⭐
    }
}
