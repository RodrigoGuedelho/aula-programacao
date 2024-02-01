import java.util.ArrayList;
import java.util.List;

public class PessoaServico {
    List<Pessoa> pessoas = new ArrayList<>();

    public PessoaServico() {
        pessoas.add(new Pessoa(26, "Rodrigo Guedelho", "06494979378"));
        pessoas.add(new Pessoa(33, "Fred", ""));
        pessoas.add(new Pessoa(28, "Roberio Guedelho", "567657576575"));
    }

    public Pessoa savar(String nome, int idade, String cpf) throws Exception {
        if (cpf.length() != 11)
            throw new Exception("CPF invalido.");

        Pessoa pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.idade = idade;
        pessoa.cpf = cpf;
        pessoas.add(pessoa);


        return pessoa;
    }

    public Pessoa editar(Pessoa pessoa, String nome, int idade, String cpf){
        pessoa.nome = nome;
        pessoa.idade = idade;
        // Salvando as mudanças no banco de dados
        return pessoa;
    }

    public List<Pessoa> buscarTodos() {
       return pessoas;
    }
}
