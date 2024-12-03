package BasicThings;

import java.util.Scanner;

public class PascalHere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Pascal's Triangle with Numbers");
            System.out.println("2. Create Pascal's Triangle with Stars");
            System.out.println("3. Calculate Binomial Coefficient (nCr)");
            System.out.println("4. Calculate Permutation (nPr)");
            System.out.println("5. Draw Patterns");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createPascalWithNumbers(scanner);
                    break;
                case 2:
                    createPascalWithStars(scanner);
                    break;
                case 3:
                    calculateBinomialCoefficient(scanner);
                    break;
                case 4:
                    calculatePermutation(scanner);
                    break;
                case 5:
                    drawPatterns(scanner);
                    break;
                case 6:
                    System.out.println("Come again when u need me ')");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            
            }
        }
    }
    // Create Pascal's Triangle with Numbers
    public static void createPascalWithNumbers(Scanner scanner){
        System.out.println("Enter rows number:");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(binomialCoefficient(i,j) + " ");

            }
            System.out.println();
        }
    }


    // Create Pascal's Triangle with Stars
    public static void createPascalWithStars(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Calculate Binomial Coefficient (nCr)
    public static void calculateBinomialCoefficient(Scanner scanner){
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter r: ");
        int r = scanner.nextInt();
        System.out.println("nCr =" + binomialCoefficient(n,r));
    }
    // Helper function for nCr
    public static long binomialCoefficient(int n,int r){
        return factorial(n) / (factorial(r) * factorial(n-r));

    }



    // Calculate Permutation (nPr)
    public static void calculatePermutation(Scanner scanner){
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter r: ");
        int r = scanner.nextInt();
        System.out.println("nPr = " + (factorial(n) / factorial(n - r)));
    }



    // Draw Patterns
    public static void drawPatterns(Scanner scanner){
        System.out.println("\nChoose a pattern:");
        System.out.println("1. Triangle");
        System.out.println("2. Rhombus");
        System.out.println("3. Circle (Approximation)");
        System.out.println("4. Cylinder");
        System.out.println("5. Right-Side Triangle");
        System.out.println("6. Trapezium");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter size: ");
                int triangleSize = scanner.nextInt();
                drawTriangle(triangleSize);
                break;

            case 2:
                System.out.print("Enter the size: ");
                int rhombusSize = scanner.nextInt();
                drawRhombus(rhombusSize);
                break;

            case 3:
                System.out.print("Enter the radius: ");
                int radius = scanner.nextInt();
                drawCircle(radius);
                break;

            case 4:
                System.out.print("Enter the height: ");
                int height = scanner.nextInt();
                System.out.print("Enter the radius: ");
                int cylRadius = scanner.nextInt();
                drawCylinder(height, cylRadius);
                break;

            
            case 5:
                System.out.print("Enter the size: ");
                int rightTriangleSize = scanner.nextInt();
                drawRightSideTriangle(rightTriangleSize);
                break;

            case 6:
                System.out.print("Enter the height: ");
                int trapeziumHeight = scanner.nextInt();
                System.out.print("Enter the top width: ");
                int topWidth = scanner.nextInt();
                System.out.print("Enter the base width: ");
                int baseWidth = scanner.nextInt();
                drawTrapezium(trapeziumHeight,topWidth,baseWidth);
                break;

            
            default:
                System.out.println("invalid choice.");
                break;
        }
    }

    // Helper function for Triangle
    public static void drawTriangle(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Helper function for Rhombus
    public static void drawRhombus(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = size-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Helper function for Circle
    public static void drawCircle(int radius){
        double dist;
        for (int i = 0; i <= 2*radius; i++) {
            for (int j = 0; j<= 2*radius; j++) {

    dist = Math.sqrt((i-radius) * (i-radius) + (j-radius) * (j-radius));
    if (dist > radius - 0.5 && dist < radius + 0.5) {
        System.out.print("*");
    } else{
        System.out.print(" ");
        }
    }
    System.out.println();
        }
    }

    // Helper function for Cylinder
    public static void drawCylinder(int height, int radius){
        drawCircle(radius); //top
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= radius * 2; j++) {
                if (j==0 || j== radius * 2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        drawCircle(radius); //bottom
    }

   // Helper function for Right-Side Triangle
   public static void drawRightSideTriangle(int size){
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j<= size; j++) {
            if (j <= size-i) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
   }



   // Helper function for Trapezium
public static void drawTrapezium(int height, int topWidth, int baseWidth) {
    if (baseWidth < topWidth) {
        System.out.println("Base width should be greater.");
        return;
    }

    double diff = (double) (baseWidth - topWidth) / (height - 1); // Allow fractional increments
    for (int i = 0; i < height; i++) {
        int currentWidth = (int) Math.round(topWidth + i * diff); // Calculate current width
        int spaces = (baseWidth - currentWidth) / 2; // Calculate spaces on each side
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < currentWidth; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}



    // Helper function for factorial
    public static long factorial(int num){
        if(num == 0 || num == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;

        }
        return fact;
    }
}
