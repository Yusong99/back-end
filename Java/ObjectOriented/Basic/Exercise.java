package ObjectOriented.Basic;

public class Exercise {
    public static void main(String[] args) {
        Person x = new Person("xys",18);
        System.out.println(x.getName());
        System.out.println(x.getAge());
    }

    static class Person {
        private final String name;
        private final int age;
        Person(String name,int age){
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    static class Student extends Person {
        protected int score;

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public int getScore() { return score; }
    }

    static class PrimaryStudent extends Student{
        protected int grade;

        public PrimaryStudent(String name, int age, int score) {
            super(name, age, score);
        }
    }
}
