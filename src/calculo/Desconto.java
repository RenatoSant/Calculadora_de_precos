package calculo;

public class Desconto extends CalculoFrete {

    public Desconto(){

    }

    public double calcularDesconto(){
        if (getKm() <= 50){
                this.desconto = (5 * preco)/100;
                return this.desconto;
        }
        else {
            this.desconto = (10 * preco)/100;
            return this.desconto;
        }
    }
}
