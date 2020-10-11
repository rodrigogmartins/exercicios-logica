package meatCalculator09;

import java.util.Scanner;

public class MeatCalculator {
    public static void main(String[] args) {
        final int MEAT_CONSUME_MEN = 400;
        final int MEAT_CONSUME_WOMEN = 320;
        final int MEAT_CONSUME_KIDS = 200;
        final double SAFETY_MARGIN = 1.2;

        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe o número de homens convidados: ");
        int invitedMen = entrance.nextInt();

        System.out.print("Informe o número de mulheres convidadas: ");
        int invitedWomen = entrance.nextInt();

        System.out.print("Informe o número de crianças convidadas: ");
        int invitedKids = entrance.nextInt();

        int menMeat = (invitedMen * MEAT_CONSUME_MEN);
        int womenMeat = (invitedWomen * MEAT_CONSUME_WOMEN);
        int kidsMeat = (invitedKids * MEAT_CONSUME_KIDS);
        double totalMeatNeeded = (menMeat + womenMeat + kidsMeat) * SAFETY_MARGIN;

        System.out.println("Total de carne necessária para o churrasco: "+(totalMeatNeeded / 1000)+"Kg");
    }
}
