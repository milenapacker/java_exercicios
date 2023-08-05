//O programa lê 2 números e oferece opções para fazer operações.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b, opcao;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = leitor.nextInt();
        System.out.print("Digite outro número: ");
        b = leitor.nextInt();

        System.out.println("Digite uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao = leitor.nextInt();

        switch(opcao) {
            case 1:
                System.out.print("O resultado da soma é " + (a+b));
                break;
            case 2:
                System.out.print("O resultado da subtração é " + (a-b));
                break;
            case 3:
                System.out.print("O resultado da multiplicação é " + (a*b));
                break;
            case 4:
                System.out.print("O resultado da divisão é " + (a/b));
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}