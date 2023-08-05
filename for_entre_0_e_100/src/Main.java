//Programa que lê 5 números e mostra quantos números estão entre 0 e 100.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero, entre;
        entre = 0;
        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();


            if (numero >= 0 && numero <= 100) {
                entre++;
            }
        }
        System.out.print("Dos números digitados, " + entre + " estão entre 0 e 100.");
    }
}