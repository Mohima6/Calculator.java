package BinaryWorld;

import java.util.Scanner;

public class BaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show menu for base conversion
        System.out.println("==== Base Conversion ====");
        System.out.println("1. Convert Decimal to Binary");
        System.out.println("2. Convert Decimal to Hexadecimal");
        System.out.println("3. Convert Decimal to Octal");
        System.out.println("4. Convert Binary to Decimal");
        System.out.println("5. Convert Binary to Hexadecimal");
        System.out.println("6. Convert Binary to Octal");
        System.out.println("7. Convert Hexadecimal to Decimal");
        System.out.println("8. Convert Hexadecimal to Binary");
        System.out.println("9. Convert Hexadecimal to Octal");
        System.out.println("10. Convert Octal to Decimal");
        System.out.println("11. Convert Octal to Binary");
        System.out.println("12. Convert Octal to Hexadecimal");
        System.out.println("13. Sum of Numbers in a Given Base");
        System.out.println("14. Subtract Numbers in a Given Base");
        System.out.print("Choose your option: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Decimal number: ");
                int decimal = scanner.nextInt();
                System.out.println("Binary: " + decimalToBinary(decimal));
                break;

            case 2:
                System.out.print("Enter Decimal number: ");
                decimal = scanner.nextInt();
                System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
                break;

            case 3:
                System.out.print("Enter Decimal number: ");
                decimal = scanner.nextInt();
                System.out.println("Octal: " + decimalToOctal(decimal));
                break;

            case 4:
                System.out.print("Enter Binary number: ");
                String binary = scanner.next();
                if (!binary.matches("[01]+")) {
                    System.out.println("Invalid binary number. Please enter a valid binary number.");
                    break;
                }
                System.out.println("Decimal: " + binaryToDecimal(binary));
                break;

            case 5:
                System.out.print("Enter Binary number: ");
                binary = scanner.next();
                if (!binary.matches("[01]+")) {
                    System.out.println("Invalid binary number. Please enter a valid binary number.");
                    break;
                }
                System.out.println("Hexadecimal: " + binaryToHexadecimal(binary));
                break;

            case 6:
                System.out.print("Enter Binary number: ");
                binary = scanner.next();
                if (!binary.matches("[01]+")) {
                    System.out.println("Invalid binary number. Please enter a valid binary number.");
                    break;
                }
                System.out.println("Octal: " + binaryToOctal(binary));
                break;

            case 7:
                System.out.print("Enter Hexadecimal number: ");
                String hexadecimal = scanner.next();
                System.out.println("Decimal: " + hexadecimalToDecimal(hexadecimal));
                break;

            case 8:
                System.out.print("Enter Hexadecimal number: ");
                hexadecimal = scanner.next();
                System.out.println("Binary: " + hexadecimalToBinary(hexadecimal));
                break;

            case 9:
                System.out.print("Enter Hexadecimal number: ");
                hexadecimal = scanner.next();
                System.out.println("Octal: " + hexadecimalToOctal(hexadecimal));
                break;

            case 10:
                System.out.print("Enter Octal number: ");
                String octal = scanner.next();
                System.out.println("Decimal: " + octalToDecimal(octal));
                break;

            case 11:
                System.out.print("Enter Octal number: ");
                octal = scanner.next();
                System.out.println("Binary: " + octalToBinary(octal));
                break;

            case 12:
                System.out.print("Enter Octal number: ");
                octal = scanner.next();
                System.out.println("Hexadecimal: " + octalToHexadecimal(octal));
                break;

            case 13:
                System.out.print("Choose base for sum operation (1: Binary, 2: Decimal, 3: Hexadecimal, 4: Octal): ");
                int sumBase = scanner.nextInt();
                System.out.print("How many numbers do you want to sum? ");
                int sumCount = scanner.nextInt();
                int sum = 0;
                for (int i = 0; i < sumCount; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    String num = scanner.next();
                    if (sumBase == 1) {
                        sum += binaryToDecimal(num);
                    } else if (sumBase == 2) {
                        sum += Integer.parseInt(num);
                    } else if (sumBase == 3) {
                        sum += hexadecimalToDecimal(num);
                    } else if (sumBase == 4) {
                        sum += octalToDecimal(num);
                    }
                }
                System.out.println("Sum: " + sum);
                break;

            case 14:
                System.out.print("Choose base for subtraction (1: Binary, 2: Decimal, 3: Hexadecimal, 4: Octal): ");
                int subBase = scanner.nextInt();
                System.out.print("How many numbers do you want to subtract? ");
                int subCount = scanner.nextInt();
                System.out.print("Enter the 1st number: ");
                String firstNum = scanner.next();
                int result = 0;

                if (subBase == 1) {
                    result = binaryToDecimal(firstNum);
                } else if (subBase == 2) {
                    result = Integer.parseInt(firstNum);
                } else if (subBase == 3) {
                    result = hexadecimalToDecimal(firstNum);
                } else if (subBase == 4) {
                    result = octalToDecimal(firstNum);
                }

                for (int i = 1; i < subCount; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    String num = scanner.next();

                    if (subBase == 1) {
                        result -= binaryToDecimal(num);
                    } else if (subBase == 2) {
                        result -= Integer.parseInt(num);
                    } else if (subBase == 3) {
                        result -= hexadecimalToDecimal(num);
                    } else if (subBase == 4) {
                        result -= octalToDecimal(num);
                    }
                }
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexadecimal(decimal);
    }

    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    public static String hexadecimalToBinary(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToBinary(decimal);
    }

    public static String hexadecimalToOctal(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToOctal(decimal);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);
    }

    public static String octalToHexadecimal(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToHexadecimal(decimal);
    }
}
