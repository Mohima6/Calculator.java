package BasicThings;

import java.util.Arrays;
import java.util.Scanner;


public class PrimeMedian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Even or Odd Check");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Prime Check");
            System.out.println("4. Calculate Average");
            System.out.println("5. Calculate Median");
            System.out.println("6. Calculate GCD");
            System.out.println("7. Calculate LCM");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    evenOddCheck(scanner);
                    break;

                case 2:
                    leapYearCheck(scanner);
                    break;

                case 3:
                    primeCheck(scanner);
                    break;

                case 4:
                    calculateAverage(scanner);
                    break;

                case 5:
                    calculateMedian(scanner);
                    break;

                case 6:
                    calculateGCD(scanner);
                    break;

                case 7:
                    calculateLCM(scanner);
                    break;

                case 8:
                    System.out.println("Thank u.Come again!");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("invalid choice.");
                    break;
            }
        }
    }

    // Even or Odd Check
    public static void evenOddCheck(Scanner scanner){
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is Even.");
        } else {
            System.out.println(num + "is Odd.");
        }
    }


    //leap year check
    public static void leapYearCheck(Scanner scanner){
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "is a Leap Year.");
        } else {
            System.out.println(year + "is not a Leap Year.");
        }
    }


    //prime check
    public static void primeCheck(Scanner scanner){
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + "is Prime.");
        } else {
            System.out.println(num + "is not Prime.");
        }
    }

    // Helper method for prime check
    public static boolean isPrime(int num){
        if (num<=1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;

        }
          return true;        
    }


     // Calculate Average
     public static void calculateAverage(Scanner scanner){
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double sum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }
        System.out.println("Average = " + (sum/n));
     }

     //Calculate Median
     public static void calculateMedian(Scanner scanner){
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double [] numbers = new double[n];
        System.out.println("Enter the elements:");
        for (int i= 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();           
        }

        Arrays.sort(numbers);
        double median;
        if (n % 2 == 0) {
            median = (numbers[n/2 -1] + numbers[n/2]) / 2.0;

        } else {
            median = numbers[n/2];

        }
        System.out.println("Median = " + median);
     }

     // Calculate GCD
     public static void calculateGCD(Scanner scanner){
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD = " + gcd(a,b));
     }

     //Helper method for GCD
     public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
     }

     // Calculate LCM
     public static void calculateLCM(Scanner scanner){
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("LCM = " + (a*b) /gcd(a, b));
     }
}
