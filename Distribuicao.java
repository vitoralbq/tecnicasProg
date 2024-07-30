import java.util.Random;
public abstract class Distribuicao<T> {
    public double media;
    public double variancia;
    public double dp;
    public Random random;



    public abstract T getNumeros(int n);



    public double getMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }


    public double getVariancia(double[] valores) {
        double media = getMedia(valores);
        double soma = 0;
        for (double valor : valores) {
            soma += Math.pow(valor - media, 2);
        }
        return soma / valores.length;
    }

}
