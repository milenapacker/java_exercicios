//O programa lê dados e imprime na tela.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome, endereco, telefone, area;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite o seu endereço: ");
        endereco = leitor.nextLine();
        System.out.print("Digite o seu telefone: ");
        telefone = leitor.nextLine();
        System.out.print("Digite a sua área de atuação: ");
        area = leitor.nextLine();

        System.out.println("O seu nome é " + nome + " , você mora na " + endereco + ", seu telefone é " + telefone + "  e sua área de atuação é " + area);
    }
}