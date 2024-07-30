import java.util.Random;

public class DistribuicaoNormal extends Distribuicao {
    private double media;
    private double dp;
    private Random random;

    public DistribuicaoNormal(double media, double dp) {
        this.media = media;
        this.dp = dp;
        this.random = new Random();
    }
    @Override
    public double[] getNumeros(int n) {
        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            valores[i] = media + dp * random.nextGaussian();
        }
        return valores;
    }
}
