package averageGrade06;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        float grade1 = entrance.nextFloat();

        System.out.print("Informe a segunda nota do aluno: ");
        float grade2 = entrance.nextFloat();

        System.out.printf("A média entre as notas do aluno é: %f", ((grade1 + grade2) / 2));
    }
}
