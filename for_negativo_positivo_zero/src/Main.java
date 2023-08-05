//O programa lê 5 números e mostra quantos são positivos, negativos e zero//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero, positivo, negativo, zero;
        Scanner leitor = new Scanner(System.in);
        positivo = 0;
        negativo = 0;
        zero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();

            if (numero == 0) {
                zero++;
            } else if (numero < 0) {
                negativo++;
            } else {
                positivo++;
            }
        }
        System.out.print(positivo + " número(s) positivo(s), " + negativo + " número(s) negativo(s), " + zero + " número(s) zero.");
    }
}