package sintaxe_variaveis_fluxo;

public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        // boolean acompanhado = quantidadePessoas >=2;

        boolean acompanhado;

        if(quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);
    }

}