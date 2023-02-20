package calculo;

public abstract class Calculo {
    protected static final double frete = 2.50;
    protected double desconto;
    protected double preco;

    public Calculo() {
    }

    public Calculo(int desconto, double preco) {
        this.desconto = desconto;
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
