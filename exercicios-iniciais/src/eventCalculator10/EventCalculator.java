package eventCalculator10;

import java.util.Scanner;

public class EventCalculator {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Preço do ingresso: ");
        float ticketPrice = entrance.nextFloat();

        System.out.print("Informe o número de sócios do clube: ");
        int partners = entrance.nextInt();

        System.out.print("Informe o número de crianças menores de 10 anos: ");
        int nonPaying = entrance.nextInt();

        System.out.print("Informe o número de pessoas que pagam o valor completo: ");
        int normalPeople = entrance.nextInt();


        int totalOfPeople = (partners + nonPaying + normalPeople);
        float totalValueLost = (float) ((nonPaying * ticketPrice) + (partners * (ticketPrice * 0.3)));
        float totalValueCollected = (float) ((normalPeople * ticketPrice) + (partners * (ticketPrice * 0.7)));

        System.out.println("Total de pessoas no evento: "+totalOfPeople);
        System.out.println("Valor total perdido no evento: R$ "+totalValueLost);
        System.out.println("Valor total arrecadado no evento: R$ "+totalValueCollected);
    }
}
