public class Porta {
    private String nome;
    private String premio;

    public Porta(String nome, String premio) {
        this.nome = nome;
        this.premio = premio;
    }

    public String getNome(){
        return nome;
    }
    public String getPremio(){
        return premio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Porta porta = (Porta) o;

        if (!nome.equals(porta.nome)) return false;
        return premio.equals(porta.premio);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + premio.hashCode();
        return result;
    }
}