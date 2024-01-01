package Introduction.Basic;

public class ShiftOperator {
    public static void main(String[] args) {
        int n = 7;
        //7->00000111
        //shift operation
        int a = n<<1;//00001110
        int b = n>>1;//00000011
        //System.out.println(a);//14
        //System.out.println(b);//3

        //type change
        int i = 1234567;
        short s1 = (short)i;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(s1));
        System.out.println(Integer.toBinaryString(-10617));
        System.out.println(s1);
    }
}
