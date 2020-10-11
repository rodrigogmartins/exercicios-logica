package travelTime07;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe a distancia(Km) da viagem: ");
        float distance = entrance.nextFloat();

        System.out.print("Informe a velocidade(Km/h) de viagem: ");
        float velocity = entrance.nextFloat();

        System.out.printf("O tempo de viagem é: %f horas.", (distance / velocity));
    }
}
