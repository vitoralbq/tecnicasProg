import java.util.Random;
public class DistribuicaoPoisson extends Distribuicao {
    private double lambda;
    private Random random;

    public DistribuicaoPoisson(double lambda) {
        this.lambda = lambda;
        this.random = new Random();
    }

    @Override
    public double[] getNumeros(int n) {
        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            valores[i] = getPoisson(lambda);
        }
        return valores;
    }

    private double getPoisson(double lambda) {
        double l = Math.exp(-lambda);
        int k = 0;
        double p = 1.0;
        do {
            k++;
            p *= random.nextDouble();
        } while (p > l);
        return k - 1;
    }
}
