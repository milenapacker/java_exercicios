//Programa que lê votos e mostra qual candidato foi o mais votado.//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int voto, voto1, voto2, voto3, voto4, branco, nulo, resultado;
        Scanner leitor = new Scanner(System.in);
        voto1 = 0;
        voto2 = 0;
        voto3 = 0;
        voto4 = 0;
        branco = 0;
        nulo = 0;

        do {
            System.out.println("Digite o número do candidato que você quer votar: ");
            System.out.println(" 1 - Candidato 1");
            System.out.println(" 2 - Candidato 2");
            System.out.println(" 3 - Candidato 3");
            System.out.println(" 4 - Candidato 4");
            System.out.println(" 5 - Voto Nulo");
            System.out.println(" 6 - Voto em Branco");
            System.out.println(" 0 - Encerrar");
            System.out.println(" >");
            voto = leitor.nextInt();

            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    branco++;
                    break;
                case 6:
                    nulo++;
                    break;
            }
        } while (voto !=0);

        resultado = voto1 + voto2 + voto3 + voto4;
        System.out.println("Quantidade dos votos em candidatos = " + resultado);
        System.out.println("Votos candidato 1 = " + voto1);
        System.out.println("Votos candidato 2 = " + voto2);
        System.out.println("Votos candidato 3 = " + voto3);
        System.out.println("Votos candidato 4 = " + voto4);
        System.out.println("Votos candidato 5 = " + branco);
        System.out.println("Votos candidato 6 = " + nulo);
    }
}