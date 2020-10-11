package cityElection08;

import java.util.Scanner;

public class CityElection {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        System.out.print("Número total de votos: ");
        int totalOfVoters = entrance.nextInt();

        System.out.print("Informe o número votos válidos: ");
        float validVotes = entrance.nextInt();

        System.out.print("Informe o número votos brancos: ");
        float whiteVotes = entrance.nextInt();

        System.out.print("Informe o número votos nulos: ");
        float nullVotes = entrance.nextInt();

        System.out.println("Votos válidos: "+((validVotes / totalOfVoters) * 100)+"%");
        System.out.println("Votos brancos: "+((whiteVotes / totalOfVoters) * 100)+"%");
        System.out.println("Votos nulos: "+((nullVotes / totalOfVoters) * 100)+"%");
    }
}
