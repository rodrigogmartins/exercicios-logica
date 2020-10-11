package isApproved12;

import java.util.Scanner;

public class IsApproved {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe a sua nota: ");
        float nota = entrance.nextInt();

        String message = (nota >= 7) ? "Parabéns, você foi aprovado!" : "Lamento, mas você terá que fazer a recuperação!";

        System.out.println(message);
    }
}
