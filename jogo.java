import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativas = 0;

        System.out.println("🎯 Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("🔻 Muito baixo! Tente um número maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("🔺 Muito alto! Tente um número menor.");
            } else {
                System.out.println("🎉 Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
            }

        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}