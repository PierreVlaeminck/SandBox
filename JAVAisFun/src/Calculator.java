import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        char operation = ' ';
        boolean inputError = true;

        while (inputError) {
            try {
                System.out.print("Entrez le premier nombre : ");
                num1 = sc.nextDouble();
                inputError = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrée non valide. Veuillez entrer un nombre.");
                sc.next();
            }
        }

        inputError = true;
        while (inputError) {
            System.out.print("Entrez l'opération (+, -, *, /) : ");
            String input = sc.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                operation = input.charAt(0);
                inputError = false;
            } else {
                System.out.println("Entrée non valide. Veuillez entrer une opération valide (+, -, *, /).");
            }
        }

        inputError = true;
        while (inputError) {
            try {
                System.out.print("Entrez le deuxième nombre : ");
                num2 = sc.nextDouble();
                inputError = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrée non valide. Veuillez entrer un nombre.");
                sc.next();
            }
        }

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("Opération non valide");
                return;
        }

        System.out.print("Résultat : " + result);
    }
}