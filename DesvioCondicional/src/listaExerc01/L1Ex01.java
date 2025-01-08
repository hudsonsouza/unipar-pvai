package listaExerc01;
import java.util.Scanner;
public class L1Ex01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double vlr1, vlr2, resultado;

        System.out.print("Digite o valor 1...: ");
        vlr1 = input.nextDouble();

        System.out.print("Digite o valor 2...: ");
        vlr2 = input.nextDouble();

        if (vlr2 == 0) {
            System.out.println("Impossível dividir");
        } else {
            resultado = vlr1 / vlr2;
            System.out.println("Resultado...: " + resultado);
            System.out.printf("Resultado...: %.2f  %n" , resultado);  //    2 CASAS DECIMAIS
        }
    }

}
