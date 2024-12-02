package BasicThings;

import java.util.Scanner;

public class UnitConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion Program:");
        System.out.println("Select the type:");
        System.out.println("1. Length");
        System.out.println("2. Weight");
        System.out.println("3. Temperature");
        System.out.println("4. Volume");
        System.out.println("5. Area");
        System.out.println("6. Speed");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lengthConversion(scanner);
                break;
            
            case 2:
                weightConversion(scanner);
                break;
            
            case 3:
                temperatureConversion(scanner);
                break;

            case 4:
                volumeConversion(scanner);
                break;

            case 5:
                areaConversion(scanner);
                break;

            case 6:
                speedConversion(scanner);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    // Length Conversion: Meters to Kilometers, Centimeters, Inches, Feet, Miles, Yards (and reverse)
    public static void lengthConversion(Scanner scanner){
        System.out.println("1. Meters to other units");
        System.out.println("2. Kilometers to meters");
        System.out.println("3. Centimeters to meters");
        System.out.println("4. Inches to meters");
        System.out.println("5. Feet to meters");
        System.out.println("6. Miles to meters");
        System.out.println("7. Yards to meters");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter length in meters: ");
            double meters = scanner.nextDouble();

            System.out.println("Converted values:");
            System.out.println(meters + "meters = " + meters/1000 + "kilometers");
            System.out.println(meters + "meters = " + meters*100 + "centimeters");
            System.out.println(meters + "meters = " + meters* 39.37 + "inches");
            System.out.println(meters + "meters = " + meters*3.281 + "feet");
            System.out.println(meters + "meters = " + meters*1.094 + "yards");
        }
        else if (choice == 2) {
            System.out.println("Enter length in kilometers:");
            double kilometers = scanner.nextDouble();
            System.out.println(kilometers + "kilometers = " + kilometers * 1000 + "meters");

        } else if (choice == 3) {
            System.out.println("Enter length in centimeters: ");
            double centimeters = scanner.nextDouble();
            System.out.println(centimeters + "centimeters = " + centimeters/100 + "meters");

        } else if (choice == 4) {
            System.out.println("Enter length in inches: ");
            double inches = scanner.nextDouble();
            System.out.println(inches + "inches = " + inches * 0.0254 + "meters");

        } else if (choice == 5) {
            System.out.println("Enter length in feet: ");
            double feet = scanner.nextDouble();
            System.out.println(feet + "feet = " + feet* 0.3048 + "meters ");

        } else if (choice == 6) {
            System.out.println("Enter length in miles: ");
            double miles = scanner.nextDouble();
            System.out.println(miles + "miles = " + miles* 1609.344 + "meters ");

        } else if (choice == 7) {
            System.out.println("Enter length in yards: ");
            double yards = scanner.nextDouble();
            System.out.println(yards + "yards = " + yards*0.9144 + "meters ");

        }
    }

    // Weight Conversion: Kilograms to Pounds, Grams, Ounces, Stones (and reverse)
    public static void weightConversion(Scanner scanner){
             System.out.println("1. Kilograms to other units");
             System.out.println("2. Pounds to kilograms");
             System.out.println("3. Grams to kilograms");
             System.out.println("4. Ounces to kilograms");
             System.out.println("5. Stones to kilograms");

             int choice = scanner.nextInt();

             if (choice == 1) {
                System.out.println("Enter weight in kilograms: ");
                double kilograms = scanner.nextDouble();

                System.out.println("Converted values:");
                System.out.println(kilograms + "kilograms = " + kilograms * 2.205 + " pounds");
                System.out.println(kilograms + "kilograms = " + kilograms * 1000 + " grams");
                System.out.println(kilograms + "kilograms = " + kilograms * 35.274 + " ounces");
                System.out.println(kilograms + "kilograms = " + kilograms * 0.1575 + " stones");
                
             } else if (choice == 2) {
                System.out.print("Enter weight in pounds: ");
                double pounds = scanner.nextDouble();
                System.out.println(pounds + "pounds = " + pounds/2.205 + "kilograms");
             } else if (choice == 3) {
                System.out.print("Enter weight in grams: ");
                double grams = scanner.nextDouble();
                System.out.println(grams + "grams = " + grams/1000 + "kilograms");
             } else if (choice == 4) {
                System.out.print("Enter weight in ounces: ");
                double ounces = scanner.nextDouble();
                System.out.println(ounces + "ounces = " + ounces/35.274 + "kilograms");
             } else if (choice == 5) {
                System.out.print("Enter weight in stones: ");
                double stones = scanner.nextDouble();
                System.out.println(stones + "stones = " + stones/0.1575 + "kilograms");
             }
        }
    // Temperature Conversion: Celsius to Fahrenheit, Kelvin, Rankine (and reverse)
    public static void temperatureConversion(Scanner scanner){
        System.out.println("1. Celsius to other units");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Celsius");
        System.out.println("4. Rankine to Celsius");

        int choice = scanner.nextInt();

        if (choice==1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            System.out.println("Converted values:");
            System.out.println(celsius + " Celsius = " + (celsius * 9/5 + 32) + "Farenheit");
            System.out.println(celsius + " Celsius = " + (celsius * 273.15) + "Kelvin");
            System.out.println(celsius + " Celsius = " + (celsius * 9/5 + 491.67) + " Rankine");
        } else if (choice==2) {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + "Farenheit = " + (fahrenheit - 32)* 5/9 + "Celsius");

        }  else if (choice==3) {
            System.out.print("Enter temperature in Kelvin: ");
            double kelvin = scanner.nextDouble();
            System.out.println(kelvin + "kelvin = " + (kelvin - 273.15) + "Celsius");
        } else if (choice==4) {
            System.out.print("Enter temperature in Rankine: ");
            double rankine = scanner.nextDouble();
            System.out.println(rankine + "Rankine = " + ((rankine - 491.67) * 5/9) + " Celsius");
        } 
    }

    // Volume Conversion: Liters to Gallons, Milliliters, Cubic Meters, Cubic Inches (and reverse)
    public static void volumeConversion(Scanner scanner){
        System.out.println("1. Liters to other units");
        System.out.println("2. Gallons to liters");
        System.out.println("3. Milliliters to liters");
        System.out.println("4. Cubic meters to liters");
        System.out.println("5. Cubic inches to liters");

        int choice = scanner.nextInt();


        if (choice==1) {
            System.out.print("Enter volume in liters: ");
            double liters = scanner.nextDouble();

            System.out.println("Converted values:");
            System.out.println(liters + "liters = " + liters * 0.2642 + "gallons");
            System.out.println(liters + "liters = " + liters * 1000 + "mililiters");
            System.out.println(liters + "liters = " + liters / 1000 + "cubic meters");
            System.out.println(liters + "liters = " + liters * 61.024 + "cubic inches");
        } else if (choice==2) {
            System.out.print("Enter volume in gallons: ");
            double gallons = scanner.nextDouble();
            System.out.println(gallons + " gallons = " + gallons / 0.2642 + "liters");
        } else if (choice==3) {
            System.out.print("Enter volume in milliliters: ");
            double milliliters = scanner.nextDouble();
        System.out.println(milliliters + " milliliters = " + milliliters/1000 + "liters");

        } else if (choice==4) {
            System.out.print("Enter volume in cubic meters: ");
            double cubicMeters = scanner.nextDouble();
        System.out.println(cubicMeters +  " cubic meters = " + cubicMeters * 1000 + "liters");

        }  else if (choice==5) {
            System.out.print("Enter volume in cubic inches: ");
            double cubicInches = scanner.nextDouble();
        System.out.println(cubicInches + " cubic inches = " + cubicInches/61.024 + "liters");
        }
    }
       
    // Area Conversion: Square Meters to Square Kilometers, Square Centimeters, Square Feet, Square Inches (and reverse)
    public static void areaConversion(Scanner scanner){
        System.out.println("1. Square Meters to other units");
        System.out.println("2. Square Kilometers to square meters");
        System.out.println("3. Square Centimeters to square meters");
        System.out.println("4. Square Feet to square meters");
        System.out.println("5. Square Inches to square meters");

        int choice = scanner.nextInt();

        if (choice==1) {
            System.out.print("Enter area in square meters: ");
            double squareMeters = scanner.nextDouble();

            System.out.println("Converted values:");
            System.out.println(squareMeters + " square meters = " + squareMeters / 1000000 + " square kilometers");
            System.out.println(squareMeters + " square meters = " + squareMeters * 10000 + " square centimeters");
            System.out.println(squareMeters + " square meters = " + squareMeters * 10.764 + " square feet");
            System.out.println(squareMeters + " square meters = " + squareMeters * 1550 + " square inches");

        } else if (choice==2) {
            System.out.print("Enter area in square kilometers: ");
            double squareKilometers = scanner.nextDouble();
            System.out.println(squareKilometers + " square kilometers = " + squareKilometers * 1000000 + " square meters");
        } else if (choice==3) {
            System.out.print("Enter area in square centimeters: ");
            double squareCentimeters = scanner.nextDouble();
            System.out.println(squareCentimeters + " square centimeters = " + squareCentimeters/10000 + "square meters");
        } else if (choice==4) {
            System.out.print("Enter area in square feet: ");
            double squareFeet = scanner.nextDouble();
            System.out.println(squareFeet + " square feet = " + squareFeet/10.764 + " square meters");
        } else if (choice==5) {
            System.out.println("Enter area in square inches: ");
            double squareInches = scanner.nextDouble();
            System.out.println(squareInches + " square inches = " + squareInches / 1550 + " square meters");
        }
    }

    // Speed Conversion: Kilometers per Hour to Meters per Second, Miles per Hour, Feet per Second (and reverse)
    public static void speedConversion(Scanner scanner){
        System.out.println("1. Kilometers per hour to other units");
        System.out.println("2. Miles per hour to kilometers per hour");
        System.out.println("3. Feet per second to kilometers per hour");
        System.out.println("4. Meters per second to kilometers per hour");

        int choice = scanner.nextInt();


        if (choice==1) {
            System.out.print("Enter speed in kilometers per hour: ");
            double kmph = scanner.nextDouble();


            System.out.println("Converted values: ");
            System.out.println(kmph + "km/h = " + kmph * 1000 / 3600 + " m/s ");
            System.out.println(kmph + " km/h = " + kmph / 1.609 + "miles per hour");
            System.out.println(kmph + " km/h = " + kmph * 0.9114 + " feet per second");

        } else if (choice==2) {
            System.out.print("Enter speed in miles per hour: ");
            double mph = scanner.nextDouble();
            System.out.println(mph + "miles per hour = " + mph* 1.609 + " kilometers per hour");

        } else if (choice==3) {
            System.out.print("Enter speed in feet per second: ");
            double fps = scanner.nextDouble();
            System.out.println(fps + " feet per second = " + fps * 0.3048 + " meters per second");


        } else if (choice==4) {
            System.out.print("Enter speed in meters per second: ");
            double mps = scanner.nextDouble();
            System.out.println(mps + " meters per second = " + mps*3.6 + " kilometers per hour");
        }
    }
       
}
