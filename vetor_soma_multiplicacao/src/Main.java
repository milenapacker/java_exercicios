//Programa que lê a quantidade que quiser de números e faz a soma e a multiplicação entre esses números.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        int soma, mult;
        soma = 0;
        mult = 1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print("> ");
            numeros[i] = leitor.nextInt();
            soma = soma + numeros[i];
            mult = mult * numeros[i];
        }

        System.out.println("A soma entre esses números é: " + soma);
        System.out.println("A multiplicação entre esses números é: " + mult);
    }
}