package listaExerc01;
import java.util.Scanner;
public class L1Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        int anoAtual=2025, anoNasc, idade;

        System.out.print("Digite o seu nome...: ");
        nome = input.nextLine();

        System.out.print("Ano de Nascimento...: ");
        anoNasc = input.nextInt();

        idade = anoAtual - anoNasc;

        if (idade >= 0 && idade < 16) {
            System.out.println("NÃO VOTA 0-15 ANOS");

        } else if (idade >= 16 && idade <= 17) {
            System.out.println("FACULTATIVO 16-17 ANOS");

        } else if (idade >= 18 && idade <= 65) {
            System.out.println("OBRIGATÓRIO 18-65 ANOS");

        } else if (idade >= 66 && idade <= 100) {
            System.out.println("OPCIONAL 66-100 ANOS");

        } else {
            System.out.println("DADOS INCORRETOS");
        }

        System.out.println("Nome: " +nome+ " - Idade: " + idade);
    }
}
