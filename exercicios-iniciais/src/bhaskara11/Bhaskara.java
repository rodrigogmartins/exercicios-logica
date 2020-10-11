package bhaskara11;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        float aValue = entrance.nextInt();

        System.out.print("Informe o valor de b: ");
        float bValue = entrance.nextInt();

        System.out.print("Informe o valor de c: ");
        float cValue = entrance.nextInt();

        float delta = (float) (Math.pow(bValue, 2) - 4 * aValue * cValue);
        float deltaSqrt = (float) Math.sqrt(delta);

        System.out.println("X': "+((- bValue + deltaSqrt) / (2 * aValue)));
        System.out.println("x\": "+((- bValue - deltaSqrt) / (2 * aValue)));
    }
}
