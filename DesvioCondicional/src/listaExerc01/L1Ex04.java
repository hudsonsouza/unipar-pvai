package listaExerc01;
import java.util.Scanner;
public class L1Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade, adolescente = 0, jovem = 0, adulto = 0, idoso = 0, contador;

        System.out.print("Qdt de pessoas...: ");
        contador = input.nextInt();

        for (int i = 0; i < contador; i++) {
            System.out.print("Digite a idade...: ");
            idade = input.nextInt();

            if (idade >= 0 && idade <= 15) {
                adolescente++;
            } else if (idade >= 16 && idade <= 25) {
                jovem++;
            } else if (idade >= 26 && idade <= 50) {
                adulto++;
            } else if (idade >= 51) {
                idoso++;
            } else {
                System.out.println("Idade incorreta");
            }
        }

        System.out.println("Total de adolescente...: " + adolescente);
        System.out.println("Total de jovem.........: " + jovem);
        System.out.println("Total de adulto........: " + adulto);
        System.out.println("Total de idoso.........: " + idoso);
    }
}
