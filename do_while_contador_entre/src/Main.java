//Programa lê números e mostra quantos estão entre os intervalos.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, cont1, cont2, cont3;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();

            if(numero >= 0 && numero <= 25) {
                cont1++;
            } else if(numero >=26 && numero <=50) {
                cont2++;
            } else if(numero <=76 && numero <=100) {
                cont3++;
            }

        } while (numero > 0);
        System.out.print(cont1 + " números entre 0 e 25, " + cont2 + " números entre 26 e 50 e " + cont3 + " números entre 76 e 100.");
    }
}