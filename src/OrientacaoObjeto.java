public class OrientacaoObjeto {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Rodrigo";
        p1.idade = 26;

        String fala = p1.falar2("sadhajsdabdsjdhsdjsd");
        Pessoa p2 = p1.pessoa();
        System.out.println(fala);

    }
}
