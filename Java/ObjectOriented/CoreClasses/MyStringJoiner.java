package ObjectOriented.CoreClasses;

import java.util.StringJoiner;

public class MyStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        //var sj = new StringJoiner(", ");
        var sj = new StringJoiner(", ","Hello, ","!");//when you need start and ending
        for (String name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());

        System.out.println(myJoin(names));//when you do not need start and ending
    }

    static String myJoin(String[] names){
        return String.join(",",names);
    }
}
