import java.util.Random;
public class DistribuicaoUniforme extends Distribuicao {
    private double a;
    private double b;
    private Random random;

    public DistribuicaoUniforme(double a, double b) {
        this.a = a;
        this.b = b;
        this.random = new Random();
    }

    @Override
    public double[] getNumeros(int n) {
        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            valores[i] = a + (b - a) * random.nextDouble();
        }
        return valores;
    }
}


