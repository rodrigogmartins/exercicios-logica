package numberAncestor01;

import java.util.Scanner;

public class NumberAncestor {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = entrance.nextInt();

        System.out.printf("O número antecessor é: %d", (number - 1));
    }
}
