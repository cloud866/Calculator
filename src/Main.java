import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int operand1 = scanner.nextInt(); //считывает число
        System.out.println("Enter second number");
        int operand2 = scanner.nextInt();
/*Метод next() класса Scanner считывает строку,
а метод charAt(0) позволяет взять первый символ в этой строке.
 так мы получаем операцию, которую нужно выполнить*/
        System.out.println("Choose an operator: +, -, *, or /");
        char operation = scanner.next().charAt(0);

        switch (operation) {

            // performs addition between numbers
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;

            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;

            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;

            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }
}