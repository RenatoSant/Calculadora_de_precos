package calculo;

public class CalculoPreco extends Desconto {
    private double precoFinal;

    public CalculoPreco(){

    }
    public double calcularPreco(){
        this.precoFinal = (preco + getValorFrete()) - desconto;
        return this.precoFinal;
    }

    @Override
    public String toString() {
        return "O produto comprado no valor de R$" + preco + " com o acréscimo de " + getValorFrete() +
                " do frete, menos o desconto de " + desconto + " o valor final fica por R$" + precoFinal + ".";
    }
}
