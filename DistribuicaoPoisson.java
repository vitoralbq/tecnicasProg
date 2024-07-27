import java.util.Random;
public class DistribuicaoPoisson extends Distribuicao<Integer> {
    private Random random;

    public DistribuicaoPoisson(double lambda) {
        super(lambda, lambda);
        this.random = new Random();
    }

    @Override
    public Integer getNumeros() {
        double exponencial = Math.exp(-media);
        int x = 0;
        double y = 1.0;
        do {
            x++;
            y *= random.nextDouble();
        } while (y > exponencial);
        return x-1;
    }
}
