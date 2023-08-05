//Programa que lê números e mostra quantos são pares e ímpares.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int par, impar;
        par = 0;
        impar = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("> ");
            numeros[i] = leitor.nextInt();

            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        int[] pares = new int[par];
        int[] impares = new int[impar];
        par = 0;
        impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[par] = numeros[i];
                par++;
            } else {
                impares[impar] = numeros[i];
                impar++;
            }
        }
        System.out.println("Os números são: ");
        for(int i=0; i<numeros.length; i++) {
            System.out.printf("%d \n", numeros[i]);
        }

        System.out.println("Os números pares são: ");
        for(int i=0; i<pares.length; i++) {
            System.out.printf("%d \n" , pares[i]);
        }

        System.out.println("Os números ímpares são: ");
        for(int i=0; i<impares.length; i++){
            System.out.printf("%d \n" , impares[i]);
        }
    }
}
