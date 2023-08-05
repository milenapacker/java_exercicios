//Programa que lê notas enquanto a nota for maior que zero e faz a média.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor, quantidade, contador;
        quantidade = 0;
        contador = 0;

        System.out.println("Digite as notas ");
        do {
            System.out.print(" >");
            valor = leitor.nextDouble();

            if (valor > 0){
                quantidade++;
                contador = contador + valor;
            }
        } while (valor > 0);
        System.out.print("A média das notas é " + (contador / quantidade));
    }
}