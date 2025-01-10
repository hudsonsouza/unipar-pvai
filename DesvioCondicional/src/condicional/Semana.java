package condicional;
import java.util.Scanner;
public class Semana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;

        System.out.print("Digite um número de 1 a 7: ");
        dia = input.nextInt();

        if(dia == 1){
            System.out.println(dia + " - Domingo");
        } else if(dia == 2){
            System.out.println(dia + " - Segunda-Feira");
        } else if(dia == 3){
            System.out.println(dia + " - Terça-Feira");
        } else if(dia == 4){
            System.out.println(dia + " - Quarta-Feira");
        } else if(dia == 5){
            System.out.println(dia + " - Quinta-Feira");
        } else if(dia == 6){
            System.out.println(dia + " - Sexta-Feira");
        } else if(dia == 7){
            System.out.println(dia + " - Sábado");
        } else {
            System.out.println("Valor "+dia + " é um Dado Inválido.");
        }

    }
}
