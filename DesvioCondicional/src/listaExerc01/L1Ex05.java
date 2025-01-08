package listaExerc01;

import java.util.Scanner;

public class L1Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha = "Unipar2025", senhaUsuario;
        boolean autenticacao = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("\nDigite sua senha...: ");
            senhaUsuario = input.nextLine();

            if (senha.equals(senhaUsuario)) {
                System.out.println("\nACESSO PERMITIDO!");
                autenticacao = true;
                break;
            } else {
                System.out.println("ACESSO NEGADO.");
                autenticacao = false;
            }
        }

        if (autenticacao == false) {
            System.out.println("\nLimite de 3 tentativas esgotadas.");
            System.out.println("### CARTÃO BLOQUEADO ###");
        }

    }
}
