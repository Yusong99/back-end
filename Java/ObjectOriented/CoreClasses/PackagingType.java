package ObjectOriented.CoreClasses;

public class PackagingType {
    public static void main(String[] args) {
        Integer n = null;
        Integer n2 = new Integer(99);
        System.out.println(ConversionNumber.x1);
        System.out.println(ConversionNumber.x2);
    }

    public static class Integer {

        private int value;
        public  Integer(int value){
            this.value = value;
        }

        public int intValue(){
            return this.value;
        }
    }

    public static class ConversionNumber{
        static int x1 = java.lang.Integer.parseInt("100");
        static int x2 = java.lang.Integer.parseInt("100",16);
    }
}
