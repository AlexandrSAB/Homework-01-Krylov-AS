import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("Hello world!");
        byte a = 100;
        System.out.println(a);
        short b, c ,d;
        b = 400;
        c = 500;
        d = 600;
        System.out.println(a += 200);
        System.out.println();
        System.out.println(c);
        a --;
        System.out.println(a);
        char symbol = '$';
        System.out.println(symbol + 1);*/

        calculateSecondsFromUser();

    }



    private static void calculateSecondsFromUser() {
        System.out.println("Enter amount of seconds: ");
        Scanner sc = new Scanner(System.in);
        int secondsFromUser = sc.nextInt();
        int days = (secondsFromUser / 60 / 60 / 24);
        int hours = (secondsFromUser / 60 / 60) % 24;
        int minutes = (secondsFromUser / 60) % 60;
        int seconds = (secondsFromUser % minutes);
        System.out.println("There are " + days + " days");
        System.out.println("There are " + hours + " hours");
        System.out.println("There are " + minutes + " minutes");
        System.out.println("There are " + seconds + " seconds");
    }


}
