
public class Main {
    public static void main(String[] args) {

        task1_creating_variables();

        task2_greeting("Alex");

        task3_is_positive_1(500);

        task4_is_positive_2(-500);

        task5_output_sequence_of_numbers();

    }

    private static void task1_creating_variables() {
        byte a = 100;
        short b = 30000;
        int c = 100500;
        long d = -100500100;
        float e = 3.1141592654F;
        double f = -3.141592654;
        char g = '$';
        boolean h = true;
    }

    private static void task2_greeting(String name) {
        System.out.println("Hello, " + name);
    }

    private static boolean task3_is_positive_1(int number1) {
        if (number1 < 0) {return false;}
        else {return true;}
    }

    private static void task4_is_positive_2(int number2) {
        if (number2 < 0) {System.out.println("The number is negative");}
        else {System.out.println("The number is positive");}
    }

    private static void task5_output_sequence_of_numbers() {
        short number = 1000;
        while (number >= 0) {
            if(number % 3 == 0) {
                System.out.println(number);
            };
            --number;
        }

    }

}
