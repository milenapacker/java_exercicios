//O programa lê 2 números e imprime qual é o maior, menor ou igual//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        valor1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        valor2 = leitor.nextInt();

        if(valor1 <valor2){
            System.out.print(valor2 + " é maior que " + valor1);
        } else if(valor1 > valor2){
            System.out.print(valor1 + " é maior que " + valor2);
        }else{
            System.out.print(valor1 + " e " + valor2 + " são iguais");
        }
    }
}