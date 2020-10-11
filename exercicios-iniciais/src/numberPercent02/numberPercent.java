package numberPercent02;

import java.util.Scanner;

public class numberPercent {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double number = entrance.nextDouble();

        System.out.printf("O valor do número atualizado é: %f", (number * 1.2));
    }
}
