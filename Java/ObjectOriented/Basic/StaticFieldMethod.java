package ObjectOriented.Basic;

public class StaticFieldMethod {
    public void main(String[] args) {
        PersonS xys = new PersonS("xuyusong", 18);
        PersonS flx = new PersonS("fanglixin", 18);
        PersonS.number = 88;

    }

    static class PersonS{
        public String name;
        public int age;

        public static int number;

        public PersonS(String name, int age){
            this.name  = name;
            this.age = age;
        }

    }
}

