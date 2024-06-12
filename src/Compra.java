public class Compra {
    private String nomeDaCompra;
    private double valorDaCompra;

    public Compra(String nomeDaCompra, double valorDaCompra) {
        this.nomeDaCompra = nomeDaCompra;
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public String toString() {
        return nomeDaCompra + " - R$ " + valorDaCompra;
    }
}
