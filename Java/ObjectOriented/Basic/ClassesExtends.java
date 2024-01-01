package ObjectOriented.Basic;

import java.util.Arrays;

public class ClassesExtends {
    public static  void main(String[] args) {
        Student xys = new Student();
        xys.setName("xuyusong");
        xys.setAge(18);
        xys.setScore(99);
        int[] num = {xys.getScore(),xys.getAge()};
        String[] thing = {xys.getGender(),xys.getName()};
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(thing));

        //upcasting
        PersonC flx = new Student();
    }
    static class PersonC {
        private String name;
        private int age;
        //protect not private
        protected String gender = "boy";

        public String getName() {return this.name;}

        public void setName(String name) {this.name = name;}

        public int getAge() {return this.age;}

        public void setAge(int age) {this.age = age;}
    }
    //super class/parent class/base class

    //subclass/extended class
    static class Student extends PersonC {
        private int score;

        public void setScore(int score){this.score = score;}
        public int getScore(){return this.score;}
        public String getGender(){return this.gender;}
    }


}

