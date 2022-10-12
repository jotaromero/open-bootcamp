package topic4;

import java.util.Random;

public class ControlStructures {

    public static void main(String[] args) {
        System.out.println("* Exercise with if sentence:");
        int numberIf = generateNumber();
        if (numberIf < 0) {
            System.out.println(numberIf + " is negative");
        } else if (numberIf > 0) {
            System.out.println(numberIf + " is positive");
        } else {
            System.out.println(numberIf + " is zero");
        }

        System.out.println("* Exercise with while loop:");
        int numberWhile = 1;
        while (numberWhile < 3) {
            System.out.println("numberWhile=" + numberWhile);
            numberWhile++;
        }

        System.out.println("* Exercise with do-while loop:");
        numberWhile = 2;
        do {
            System.out.println("numberWhile=" + numberWhile);
            numberWhile++;
        } while (numberWhile < 3);

        System.out.println("* Exercise with for loop:");
        for (int numberFor=0; numberFor <=3; numberFor++){
            System.out.println("numberFor=" + numberFor);
        }

        System.out.println("* Exercise with switch:");
        String season = "SUMMER";
        switch (season.toLowerCase()){
            case "spring":
                System.out.println("It´s summer season");
                break;
            case "summer":
                System.out.println("It´s summer season");
                break;
            case "autumn":
                System.out.println("It´s autumn season");
                break;
            case "winter":
                System.out.println("It´s winter season");
                break;
            default:
                System.out.println(season + " is not a known season!");
        }
    }

    private static int generateNumber() {
        Random random = new Random();
        int value = random.nextInt();
        return random.nextInt() % 2 == 0 ? value : -value;
    }
}