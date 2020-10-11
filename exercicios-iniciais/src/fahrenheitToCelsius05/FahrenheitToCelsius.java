package fahrenheitToCelsius05;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Informe a a temperatura em graus Fahrenheit: ");
        float temperature = entrance.nextFloat();
        float celsiusTemperature = (((temperature - 32) / 9) * 5);

        System.out.printf("A temperatura em graus Celsius é: %f", celsiusTemperature);
    }
}
