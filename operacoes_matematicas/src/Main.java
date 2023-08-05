//O programa lê 2 números e calcula as operações.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor1, valor2, adi, sub, mul, div;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        valor1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        valor2 = leitor.nextInt();

        adi = valor1 + valor2;
        sub = valor1 - valor2;
        mul = valor1 * valor2;
        div = valor1 / valor2;

        System.out.println("A soma entre os números é " + adi);
        System.out.println("A substração entre os números é " + sub);
        System.out.println("A multiplicação entre os números é " + mul);
        System.out.println("A divisão entre os números é " + div);
    }
}