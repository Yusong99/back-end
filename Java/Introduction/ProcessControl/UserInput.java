package Introduction.ProcessControl;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //create Scanner ObjectOriented.Basic.Object
        Scanner scanner = new Scanner(System.in);
        //String Input
        String name = scanner.nextLine();
        //Integer Input
        int age = scanner.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}
