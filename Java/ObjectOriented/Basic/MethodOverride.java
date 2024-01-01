package ObjectOriented.Basic;

public class MethodOverride {
    public static void main(String[] args) {
    PersonO p = new PersonO();
    p.run();
    }

    static class PersonO {
        public void run() {
            System.out.println("Person.run");
        }
    }

    static class StudentO extends PersonO {

        @Override
        public void run() {
            System.out.println("Student.run");
        }
    }

}


