package br.com.sistemadebanco.model;

public class ValidacaoDeSenha {
    private String senha = "1234";
    private int tentativas = 5;

    public String getSenha() {
     return senha;
    }

    public void setSenha(String senha) {
        boolean retorna = false;
        while (!retorna) {

            //Validação de tentativas
            if (this.senha != senha) {
                System.out.println("Senha incorreta, por favor digite a senha novamente.");
                this.tentativas --;
                System.out.println("Você tem um total de " + tentativas + " tentativas");
                retorna = true;
            } else if (this.tentativas == 0) {
                System.out.println("Suas tentativas acabaram");
                break;
            } else {
                System.out.println("Senha correta.");
                return;
            }
        }
    }
}
