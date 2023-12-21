import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogoTresPortas {
    List<Porta> portasSorteio = new ArrayList<Porta>();

    public static void main(String[] args) {
        JogoTresPortas  jogo = new JogoTresPortas();

        List<Double> resultados =  jogo.sortear(100000);
        System.out.println("Resultado em manter escolha: " + resultados.get(0));
        System.out.println("Resultado em mudando escolha: " + resultados.get(1));
    }

    public  List<Double> sortear(int numeroSorteio) {
        this.initPortas();
        Random random = new Random();
        double numeroVezesEscolherOutroLado = 0;
        double numeroVezesManterEscolhaInicial = 0;
        for (int i = 0; i < numeroSorteio; i++) {
            int numeroSorteado = random.nextInt(3) ;
            Porta p = this.portasSorteio.get(numeroSorteado);
            int posicaoPortaRevelada = 0;

            if (p.getPremio().equals("Premio"))
                numeroVezesManterEscolhaInicial ++;
            else{
                for (int y = 0; y < numeroSorteio; y++)
                    if(y != numeroSorteado && portasSorteio.get(y).getPremio().equals("Vazia")) {
                        posicaoPortaRevelada = y;
                        Porta p1 = portasSorteio.get(y);
                        Porta p2 = portasSorteio.get(numeroSorteado);

                        portasSorteio.remove(p1);
                        portasSorteio.remove(p2);

                        if (portasSorteio.get(0).getPremio().equals("Premio"))
                            numeroVezesEscolherOutroLado ++;
                        this.initPortas();
                        break;
                    }
                }
            }

            double percentualAcertosMantendoEscolha = (numeroVezesManterEscolhaInicial / numeroSorteio) * 100;
            double percentualMudaEscolhaAposRevelacao = (numeroVezesEscolherOutroLado / numeroSorteio) * 100;

            List<Double> resultados = new ArrayList<>();
            resultados.add(percentualAcertosMantendoEscolha);
            resultados.add(percentualMudaEscolhaAposRevelacao);
            return resultados;
        }

        public void initPortas(){
            portasSorteio.clear();
            portasSorteio.add(new Porta("Porta 1", "Vazia"));
            portasSorteio.add(new Porta("Porta 2", "Vazia"));
            portasSorteio.add(new Porta("Porta 3", "Premio"));
        }
}


