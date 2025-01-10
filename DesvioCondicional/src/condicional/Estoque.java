package condicional;

public class Estoque {
    public static void main(String[] args) {

        String produto = "Cimento";
        int estoque = -4;

        if(estoque >= 0 && estoque <= 20){
            System.out.println("Estoque de "+produto+" Baixo - " + estoque + " sacos");

        } else if(estoque >= 21 && estoque <= 150){
            System.out.println("Estoque de "+produto+" Normal - " + estoque + " sacos");

        } else if(estoque >= 151){
            System.out.println("Estoque de "+produto+" Alto - " + estoque + " sacos");

        } else {
            System.out.println("Dados de "+produto+ " Incorreto.");
        }
    }

}
