import java.util.ArrayList;
import java.util.List;

public class Estatisticas<T extends Distribuicao<?>> {
    private T distribuicao;

    public Estatisticas(T distribuicao) {
        this.distribuicao = distribuicao;
    }

    public void imprimirValoresGerados(int n) {
        List<String> valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add(distribuicao.getNumeros().toString());
        }
        System.out.println(String.join(", ", valores));
    }

    public void imprimirMedia() {
        System.out.println("Média: " + distribuicao.getMedia());
    }

    public void imprimirVariancia() {
        System.out.println("Variância: " + distribuicao.getVariancia());
    }

    public void imprimirDP() {
        System.out.println("Desvio Padrão: " + distribuicao.getDP());
    }
}

