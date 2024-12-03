package BasicThings;

import java.util.Scanner;

public class SumSub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Multiplication Table");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1 -> sum(scanner);
                case 2 -> subtract(scanner);
                case 3 -> multiply(scanner);
                case 4 -> divide(scanner);
                case 5 -> modulus(scanner);
                case 6 -> multiplicationTable(scanner);
                case 0 -> {
                    System.out.println("BYE! go and study,kid. ') ");
                    System.exit(0);

                }
        default -> System.out.println("try again,dear!");
            }
        }
    }


    //sum 
    public static void sum(Scanner scanner){
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Please enter a value between 1 and 10.");
            return;

        }
        double sum = 0;
        System.out.print("Enter the numbers:");
        for (int i = 0; i< n; i++) {
            sum += scanner.nextDouble();          
        }
        System.out.println("The sum is: " + sum);
    }


    //Subtract numbers
    public static void subtract(Scanner scanner){
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        if (n<1 || n>10) {
            System.out.println("Please enter a value between 1 and 10.");
            return;
        }
        System.out.println("Enter the numbers:");
        double result = scanner.nextDouble();
        for (int i = 1; i < n; i++) {
            result -= scanner.nextDouble();
        }

        System.out.println("The result is: " + result);
    }


    // Multiply numbers
    public static void multiply(Scanner scanner){
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        if (n < 1 || n > 10 ) {
            System.out.println("Please enter a value between 1 and 10.");
            return;
        }
        double product = 1;
        System.out.println("Enter the numbers:");
        for (int i= 0; i < n; i++) {
            product *= scanner.nextDouble();

        }
        System.out.println("The product is: " + product);
    }


    // Division of two numbers
    public static void divide(Scanner scanner){
        System.out.println("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b==0) {
            System.out.println("undefined.");
            return;
        }
        System.out.println("The result is: " + (a / b));
    }


    // Modulus of two numbers
    public static void modulus(Scanner scanner){
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b==0) {
            System.out.println("undefined.");
            return;
        }
        System.out.println("The result is: " + (a % b));
    }



    // Multiplication table
    public static void multiplicationTable(Scanner scanner){
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication Table for " + num + ":");
        for (int i= 0; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}
