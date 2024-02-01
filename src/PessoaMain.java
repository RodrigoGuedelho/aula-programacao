import javax.swing.*;

public class PessoaMain {

    public static void main(String[] args) throws Exception {
        PessoaServico pessoaServico = new PessoaServico();

        boolean encerra = false;

        while (!encerra) {
            String opcao = JOptionPane.showInputDialog("Digite uma das opções \n"
                    + "1 - lista todas pessoas.\n"
                    + "2 - Salvar uma nova pessoa.\n"
                    + "3 - Editar uma pessoa.\n"
                    + "4 - Encerrar Sistema"
            );

            if (opcao.equals("1")) {
                String messagem = "";
                for (int i = 0; i < pessoaServico.pessoas.size(); i++) {
                    Pessoa p = pessoaServico.pessoas.get(i);
                    messagem += p.cpf + " - " + p.nome + "\n";
                }

                JOptionPane.showMessageDialog(null, messagem);
            } else if (opcao.equals("2")) {
                String nome =JOptionPane.showInputDialog("Digite o nome");
                String cpf =JOptionPane.showInputDialog("Digite o CPF");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome"));
                pessoaServico.savar(nome, idade, cpf);
            } else if (opcao.equals("3")) {

            } else if (opcao.equals("4"))
                encerra = true;


        }
    }
}
