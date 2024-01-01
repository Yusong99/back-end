package Introduction.Basic;

//14:10 25/2/2023
//22:55 26/2/2023
public class Operator {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        // boolean result = x < y;//false
        boolean result = x == y;
        System.out.println(result); //false

        //logical
        int a = 10;
        int b = 9;
        // boolean r = x>y && a<b; //false
        boolean r = x>y || a<b; //true
        System.out.println(r);
        System.out.println(!r); //false
        /*
        整数相除只会得到整数
        想要的到有小数的结果，需要有小数参与运算
         */
        System.out.println(5/2);//2
        System.out.println(5.0/2);//2.5
        int num = 10;
        System.out.println(num+(num++)+num);//31
        System.out.println(num+(++num)+num);//35
    }
}
