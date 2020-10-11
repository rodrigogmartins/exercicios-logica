package numberSquare03;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = entrance.nextInt();

        System.out.printf("O valor do número ao quadrado é: %d", (number * number));
    }
}
