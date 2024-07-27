import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao<Double> {
    private Random random;

    public DistribuicaoExponencial(double lambda) {
        super(1 / lambda, 1 / (lambda * lambda));
        this.random = new Random();
    }

    @Override
    public Double getNumeros() {
        return -Math.log(1 - random.nextDouble()) / (1 / media);
    }
}
