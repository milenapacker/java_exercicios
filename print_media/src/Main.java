//O programa lê 4 notas e imprime a média dessas notas.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double media, nota1, nota2, nota3, nota4;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextInt();
        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextInt();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.print("A média das notas é " + media);
    }
}