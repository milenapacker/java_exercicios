//O programa lê o código de um lanche, calcula a quantidade e imprime na tela.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int quantidade, codigo;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do lanche desejado: ");
        codigo = leitor.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        quantidade = leitor.nextInt();

        switch(codigo) {
            case 100:
                System.out.print("O valor do cachorro quente é " + (1.7 * quantidade));
                break;
            case 101:
                System.out.print("O valor do bauru simples é: " + (2.3 * quantidade));
                break;
            case 102:
                System.out.print("O valor do bauru com ovo é: " + (2.6 * quantidade));
                break;
            case 103:
                System.out.print("O valor do hamburguer é " + (2.4 * quantidade));
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}