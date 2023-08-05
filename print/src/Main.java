//O programa lê um número e imprime na tela.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();
        System.out.print("O número digitado foi " + numero);
    }
}