import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao<double[]> {
    private Random random;
    private double lambda;

    public DistribuicaoExponencial(double lambda) {
        this.lambda = lambda;
        this.random = new Random();
    }

    @Override
    public double[] getNumeros(int n) {
        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            valores[i] = Math.log(1 - random.nextDouble()) / (-lambda);
        }
        return valores;
    }
}
