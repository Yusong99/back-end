package Introduction.Basic;//23:26 24/2/2023

public class Operation {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        // int result = num1/num2; 0

        // increment
        num1 = num1 +2 ;//9
        num1 += 1;//10
        //扩展赋值运算符内部自带强转效果⭐
        num1++;//11  post - increment
        ++num1;//12  pre - increment
        // int result = ++num1;  13 increment and then fetch the value
        int result = num1++;//  12 fetch the value and then increment

        // decrement
        num1--;//11


//        System.out.println(result);
        //System.out.println(true ^ true); false 异或^ 不同才是true
        //System.out.println(true ^ false);true

        byte n1 = 10;
        byte n2 = 20;
//        int n = n1 + n2;
        byte n = (byte)(n1 + n2);
        System.out.println("123" + true);
        System.out.println(n);
        char a = 'a';
        int num = 0;
        System.out.println(a + num);
    }
}
