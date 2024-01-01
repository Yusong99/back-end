package ObjectOriented.Basic;


import java.util.Arrays;

public class MethodOverload {
    public static void main(String[] args) {
        Hello xys = new Hello();
        xys.hello();
        xys.hello(new String[] {"xys", "flx"});
        xys.hello(new String[] {"xys", "flx"}, 18);

    }

    static class Hello {
        public void hello() {System.out.println("gg");}

        public void hello(String[] xys) {System.out.println(Arrays.toString(xys));}

        public void hello(String[] xys, int age) {
            System.out.println(Arrays.toString(xys));
            System.out.println(age);
        }

    }

}

