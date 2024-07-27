import java.util.Random;
public class DistribuicaoUniforme extends Distribuicao<Double> {
    private Random random;
    private double min;
    private double max;

    public DistribuicaoUniforme(double minimo, double maximo) {
        super((minimo + maximo) / 2, Math.pow((maximo - minimo), 2) / 12);
        min = minimo;
        max = maximo;
        this.random = new Random();
    }

    @Override
    public Double getNumeros() {
        return min + (max - min) * random.nextDouble();
    }
}


