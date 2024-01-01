package Introduction.ProcessControl;

//23:38 1/3/2023
//23:37 2/3/2023
public class Circulation {
    public static void main(String[] args) {
        //repeat this statement 4 times
        //loop - while, do while, for

        // 100 - condition

        int i = 7;
        while(i<6){
            System.out.println("xys" + i);
            i++;
        }

        i =7 ;
        System.out.println(i);
        do {
            System.out.println("xys" + i);
            i++;
        }while(i<6);

        for(int j = 1 ;j<=4;j++) {
            System.out.println(j);
        }

        String fruit = "apple";
        int opt =  switch (fruit)
        {
            case "peach" -> 1;
            case "banana" -> 2;
            case "apple" -> 3;
            default -> 4;
        };
        System.out.println(opt);
    }
}
