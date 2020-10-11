package triangleArea04;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe a base do triangulo: ");
        double base = entrance.nextDouble();

        System.out.print("Informe a altura do triangulo: ");
        double height = entrance.nextDouble();

        System.out.printf("A area do triangulo é: %f", ((height * base) / 2));
    }
}
