package ObjectOriented.Basic;

import java.util.ArrayList;

public class Construction {
    public static void main(String[] args) {
        Person1 xys = new Person1("xys");
        xys.print();
    }

    static class Person1 {
        String name;
        int age;
        public Person1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person1(String name)
        {
            this(name,18);
        }

        public void print(){
            System.out.println(this.age);
            System.out.println(this.name);
        }
    }
}

