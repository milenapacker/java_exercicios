//Programa que lê a idade de 5 pessoas e mostra quantas são maiores de idade.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int idade, maior;
        maior =0;
        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();

            if(idade>=18){
                maior++;
            }
        }
        System.out.print("São " + maior + " pessoa(s) maior(es) de idade.");
    }
}