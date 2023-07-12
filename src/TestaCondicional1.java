package sintaxe_variaveis_fluxo;

public class TestaCondicional1{

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 14;
        int quantidadePessoas = 3;

        if(idade>=18) {
            System.out.println("Você tem mais de 18 anos");
        }else {
            if(quantidadePessoas >= 2) {
                System.out.println("voce e menor mas pode entrar");
            }else {
                System.out.println("infelizmente vc é menor e não pode entrar.");
            }
        }

    }
}