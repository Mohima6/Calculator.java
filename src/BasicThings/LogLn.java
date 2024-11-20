package BasicThings;

import java.util.Scanner;

public class LogLn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n Logarithm Calculator - Choose an option:");
            System.out.println("1. Compute log10(x)");
            System.out.println("2. Compute ln(x)");
            System.out.println("3. Compute log_b(x) (Custom Base)");
            System.out.println("4. Compute antilog base 10 (10^x)");
            System.out.println("5. Compute antilog base e (e^x)");
            System.out.println("6. Sum of two logarithms (log10)");
            System.out.println("7. Subtraction of two logarithms (log10)");
            System.out.println("8. Multiplication of logarithms (log10 or ln)");
            System.out.println("9. Division of logarithms (log10 or ln)");
            System.out.println("10. Exit");
            System.out.println("Enter choice: ");

            int choice = scanner.nextInt();

    switch (choice) {
        case 1:
        //log10(x)
        System.out.println("Enter x: ");
        double xLog10 = scanner.nextDouble();
        if (xLog10>0) {
        System.out.println("log10 (" + xLog10 + ")= " + Math.log10(xLog10));       
        } else {
            System.out.println("Error:applicable for complex values.");
        }                   
        break;

        

        case 2:
        //ln(x)
        System.out.println("Enter x: ");
        double xLn = scanner.nextDouble();
        if (xLn>0) {
            System.out.println("ln(" + xLn + ")=" + Math.log(xLn));        
        } else {
            System.out.println("Error:applicable for complex values.");
        }
        break;



        case 3:
        //log_b(x)
        System.out.println("Enter base(b): ");
        double base = scanner.nextDouble();
        System.out.println("Enter x: ");
        double xCustom = scanner.nextDouble();

        if (base>0 && base != 1 && xCustom>0) {
            double logCustom = Math.log(xCustom) / Math.log(base);
    System.out.println("log_" + base + "(" + xCustom + ")=" + logCustom);    
        } else {
    System.out.println("Error:base must be >0 & !=1, & x must be >0.");
        }
        break;

        

        case 4:
        //antilog base 10
        System.out.println("Enter x: ");
        double xAntiLog10 = scanner.nextDouble();
        System.out.println("10^" + xAntiLog10 + "=" + Math.pow(10,xAntiLog10));
        break;



        case 5:
        //antilog base e
        System.out.println("Enter x: ");
        double xAntiLn = scanner.nextDouble();
        System.out.println("e^" + xAntiLn + "=" + Math.exp(xAntiLn));
        break;



        case 6:
        //sum 
        System.out.println("Enter x1: ");
        double x1Log = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2Log = scanner.nextDouble();
        if (x1Log>0 && x2Log>0) {
            double sum = Math.log10(x1Log) + Math.log10(x2Log);
            System.out.println("log10(" + x1Log + ") + log10(" + x2Log + ")=" + sum);            
        } else {
            System.out.println("Error:input must be > 0");
        }
        break;



        case 7:
        //subtraction
        System.out.println("Enter x1: ");
        double x1Sub = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2Sub = scanner.nextDouble();
        if (x1Sub>0 && x2Sub>0) {
            double diff = Math.log10(x1Sub) - Math.log10(x2Sub);
    System.out.println("log10(" + x1Sub + ") - log10(" + x2Sub + ")= " + diff);   
        } else {
            System.out.println("Error:input must be >0,");
        }
        break;



        case 8:
        //multiplication
        System.out.println("Enter x1: ");
        double x1Mul = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2Mul = scanner.nextDouble();
        if (x1Mul> 0 && x2Mul> 0) {
            double mulLog10 = Math.log10(x1Mul) * Math.log10(x2Mul);
            double mulLn = Math.log(x1Mul) * Math.log10(x2Mul);
            System.out.println("(log10(x1) * log10(x2) = " + mulLog10);
            System.out.println("ln(x1) * ln(x2) =" + mulLn);

        } else {
            System.out.println("Error:input must be >0.");
        }
        break;



        case 9:
        //division
        System.out.println("Enter x1: ");
        double x1Div = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2Div = scanner.nextDouble();
        if (x1Div > 0 && x2Div>0) {
            double divLog10 = Math.log10(x1Div) / Math.log10(x2Div);
            double divLn = Math.log(x1Div) / Math.log10(x2Div);
            System.out.println("log10(x1) / log10(x2) = " + divLog10);
            System.out.println("ln(x1) / ln(x2) = " + divLn);

        } else {
            System.out.println("Error:input must be >0");
        }
        break;



        case 10:
        //exit
        System.out.println("Exiting...Goodbye,dear!Come again..miss u ') ");
        running = false;
        break;

            
        default:
        System.out.println("Invalid choice.");
        break;
            }         
        }

        scanner.close();
    }
}
