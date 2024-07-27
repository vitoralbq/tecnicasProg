public abstract class Distribuicao<T> {
    protected double media;
    protected double variancia;

    public Distribuicao(double Media, double Variancia) {
        media = Media;
        variancia = Variancia;
    }

    public abstract T getNumeros();

    public double getMedia() {
        return media;
    }

    public double getVariancia() {
        return variancia;
    }

    public double getDP() {
        return Math.sqrt(variancia);
    }
}
