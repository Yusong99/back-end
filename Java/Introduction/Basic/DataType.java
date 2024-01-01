package Introduction.Basic;

//23:30 22/2/2023
public class DataType {
    public static void main(String a[]){
        /*
         * Inter:
         * 1.int->4byte->32bit
         * 2.long->8byte->64bit
         * 3.short->2byte->16bit
         * 4.byte->8bit->(-128 to 127)
         * float:
         * double->8byte
         * float->4byte
         */
        byte marks = 12;
        // float num = 5.6 error
        float num = 5.6f;
        /* charactor
        *  char->2byte
        */
        char c = 'k';
        /*
         * boolean
         * true / false
         */
        boolean b = true;
        // put a 'l' at the end of long number
        long l = 4684486L;
        long l1 = 11385961299L;
        /*
         * literals
         */
        int num1 = 0b101;//binary
        System.out.println(num1);
        int num2 = 0x7e;//hexadecimal
        System.out.println(num2);
        int num3 = 10_00_00_000;//grammar
        System.out.println(num3);

        char d = 'a';
        d++;//d == 'b'
        d++;//output d == 'c'
        System.out.println(d);
        byte e = 127;
        int f = 12;
        // System.out.println(e=f); ERROR can not convert byte to integer
        f =  (byte)e; //good
        System.out.println(f);

        float g = 5.6f;//it will lose point values
        int h = (int)g;
        System.out.println(h);
    }
}
