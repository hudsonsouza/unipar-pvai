package condicional;  // PACOTE
import java.util.Scanner;  // BIBLIOTECA
public class Motorista {  // CLASSE

    public static void main(String[] args) {  // PRINCIPAL
        // INSTANCIA
        Scanner input = new Scanner(System.in);
        // VARIAVEIS
        String nome;
        int anoAtual=2025, anoNasc, idade;

        // ENTRADA
        System.out.print("Digite o seu nome...: ");
        nome = input.nextLine();

        System.out.print("Ano de Nascimento...: ");
        anoNasc = input.nextInt();

        // PROCESSAMENTO
        idade = anoAtual - anoNasc;

        // SAIDA
        if(idade >= 18){
            // CONDICAO VERDADEIRA
            System.out.println("Caro "+nome+", com "+idade+" anos já pode dirigir!");
        } else {
            // CONDICAO FALSA
            System.out.println("Caro "+nome+", com "+idade+" anos vai de carona.");
        }

    }
}