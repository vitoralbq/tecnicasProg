import java.util.ArrayList;
import java.util.List;

public class Estatisticas<T extends Distribuicao> {
    private T distribuicao;

    public Estatisticas(T distribuicao) {

        this.distribuicao = distribuicao;
    }

    public void imprimirValoresGerados(int n) {
        double[] valores = (double[]) distribuicao.getNumeros(n);
        for (double valor : valores) {
            System.out.print(valor + ", ");
        }
        System.out.println();
    }

    public void imprimirMedia() {
        double[] valores = (double[]) distribuicao.getNumeros(1000);
        double media = distribuicao.getMedia(valores);
        System.out.println("Média: " + media);
    }

    public void imprimirVariancia() {
        double[] valores = (double[]) distribuicao.getNumeros(1000);
        double variancia = distribuicao.getVariancia(valores);
        System.out.println("Variância: " + variancia);
    }

    /*FINÇÃO DE IMPRIMIR O DESVIO PADRAO

    }*/
}

