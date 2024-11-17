package BasicThings;

import java.util.Scanner;

public class AreaVolume {

    //method to calculate 
    //circle
    public static void circle() {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter radius:");
           double radius = scanner.nextDouble();
           double area = Math.PI * radius * radius;
           double perimeter = 2 * Math.PI * radius;
           System.out.println("Area of circle: " + area);
           System.out.println("Perimeter of circle: " + perimeter);          
         }
    
    
    //rhombus
    public static void rhombus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diagonals :");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double area = (d1 * d2) / 2 ;
        double perimeter = 4 * Math.sqrt((d1 * d1 + d2 * d2) / 4);
        System.out.println("Area of Rhombus: " + area);
        System.out.println("Perimeter of Rhombus: " + perimeter);      
    }

    //rectangle
    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and width : ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double area = length * width ;
        double perimeter = 2 * (length + width);
        System.out.println("Area of rectangle:" + area);
        System.out.println("Perimeter of rectangle:" + perimeter);
    }

    //triangle
    public static void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base & height :");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Enter the lengths of the three sides: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;
        System.out.println("Area of triangle:" + area);
        System.out.println("Perimeter of triangle:" + perimeter);      
    }

    //square
    public static void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side: ");
        double side = scanner.nextDouble();
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);
    }

    //trapezium
    public static void trapezium() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of parallel sides & height : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 0.5 * (a+b) * height;
        System.out.println("Area of trapezium:" + area);
    }

    //parallelogram
    public static void parallelogram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base & height: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Enter side length: ");
        double side = scanner.nextDouble(); 
        double area = base * height ;
        double perimeter = 2 * (base+height);
        System.out.println("Area of Parallelogram:" + area);
        System.out.println("Perimeter of Parallelogram:" + perimeter);
    }

    //cylinder
    public static void cylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius & height: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Volume of Cylinder: " + volume);
        System.out.println("Surface Area of Cylinder: " + surfaceArea);

    }
    
    //square root
    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        if (number<0) {

     System.out.println("Negative numbers do not have real square roots.");
        } else{
            double result = Math.sqrt(number);
            System.out.println("Square root of " + number + "is: " + result);
        }
    }

    //cube root
    public static void cubeRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        double result = Math.cbrt(number);
        System.out.println("Cube root of" + number + "is: " + result);

    }

    //nth root
    public static void nthRoot() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number: ");
         double number = scanner.nextDouble();
         System.out.println("Enter the value of n(root):");
         double n = scanner.nextDouble();

         if (number < 0  && n % 2 == 0) {
    System.out.println("Cannot calculate the n-th root of a negative number when n is even.");

         } else {
            double result = Math.pow(number, 1.0 / n);
            System.out.println("The" + (int)n + "-th root of " + number + "is: " + result);
            
         }        
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            
            System.out.println("\nSelect: ");
            System.out.println("1. Circle");
            System.out.println("2. Rhombus");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.println("5. Square");
            System.out.println("6. Trapezium");
            System.out.println("7. Parallelogram");
            System.out.println("8. Cylinder");
            System.out.println("9. Calculate Square Root");
            System.out.println("10. Calculate Cube Root");
            System.out.println("11. Calculate N-th Root");
            System.out.println("12. Exit");


            System.out.println("Enter your choice (1-12): ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                circle();
                break;

                case 2:
                rhombus();
                break;

                case 3:
                rectangle();
                break;

                case 4:
                triangle();
                break;

                case 5:
                square();
                break;

                case 6:
                trapezium();
                break;

                case 7:
                parallelogram();
                break;

                case 8:
                cylinder();
                break;

                case 9:
                squareRoot();
                break;

                case 10:
                cubeRoot();
                break;

                case 11:
                nthRoot();
                break;

                case 12:
                System.out.println("Exiting...");
                return; 


                default:
                System.out.println("Invalid choice.");
            }
        }
    }
}
