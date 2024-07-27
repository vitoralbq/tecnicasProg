import java.util.Random;

public class DistribuicaoNormal extends Distribuicao<Double> {
    private Random random;

    public DistribuicaoNormal(double media, double variancia) {
        super(media, variancia);
        this.random = new Random();
    }

    @Override
    public Double getNumeros() {
        return media + variancia * random.nextGaussian();
    }
}
