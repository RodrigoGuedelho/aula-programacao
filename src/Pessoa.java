public class Pessoa {
    int idade;
    String nome;
    String cpf;

    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public void falar(String mensagem) {
        if (mensagem == null)
            System.out.println("Ola");
        else
            System.out.println(mensagem);
    }

    public String falar2(String mensagem) {
        if (mensagem == null)
            return "Ola";

        return mensagem;
    }


    public Pessoa pessoa(){
        return new Pessoa();
    }

}
