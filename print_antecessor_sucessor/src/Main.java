//O programa lê 1 número e imprime o seu antecessor e seu sucessor.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero, ant, suc;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        ant = numero -1;
        suc = numero +1;

        System.out.print("O antecessor do número " + numero + " é o " + ant + " e o sucessor é o " + suc + ".");
    }
}