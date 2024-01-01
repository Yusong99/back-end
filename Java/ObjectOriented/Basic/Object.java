package ObjectOriented.Basic;

import java.util.Arrays;

//1:43 11/3/2023
//23:58 12/3/2023

public class Object {
    public static void main(String[] args) {
        //      reference variable
        //      how to create an ObjectOriented.Basic.Object
        Calculator cale = new Calculator();
        int x = 520;
        int y = 1314;

        System.out.println(cale.add(x, y));

        //Parameter binding Reference type parameter binding
        ParameterBinding binding = new ParameterBinding();
        String[] binds = {"x", "y", "s"};
        binding.bindSet(binds);
        binding.bindIng();
        binds[1] = "f";
        binding.bindIng();

        Person xys = new Person();


        xys.setAge(18);
        xys.setName("xuyusong");
        xys.setBirth(1999);

        //xys.setNames("xuyusong","fanglixin","hi");
        xys.setNames(new String[] {"xuyusong", "fanglixin", "hi"});

        System.out.println(xys.getAge(2023));
        System.out.println(xys.getName());
    }

    static class Calculator {
        //method over loading
        public int add(int num1, int num2) {
            return num1 + num2;
        }

        public int add(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }

        public double add(double num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
    }


    static class Person {
        //if you use private variable, use method()
        private String name;
        private int age;
        private int birth;
        private String[] names;

        public void setName(String myName) {
            if (myName == null || myName.isBlank()) {
                throw new IllegalArgumentException("invalid name");
            }
            this.name = myName;
        }

        public void setAge(int myAge) {
            this.age = myAge;
            System.out.println(this.age);
        }

        public String getName() {
            //if there are no naming conflicts can omit name
            return name;
            //return this.name;
        }

        public int getAge(int currentYear) {
            return this.calcAge(currentYear);
        }

        public void setBirth(int myBirth) {
            this.birth = myBirth;
        }

        private int calcAge(int currentYear) {
            return currentYear - this.birth;
        }

        //variable parameter: type + ... and can change to String[]
        public void setNames(String[] names) {
            this.names = names;
            System.out.println(this.names[1]);
        }
    }

    static class ParameterBinding {
        private String[] str;
        public void bindSet(String[] str){
            this.str = str;
        }

        public void bindIng() {
            System.out.println(Arrays.toString(this.str));
        }
    }
}

