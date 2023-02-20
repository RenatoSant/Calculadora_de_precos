package calculo;

public class CalculoFrete extends Calculo{
    private int km;
    private double valorFrete;

    public CalculoFrete(){

    }

    public CalculoFrete(int km) {
        this.km = km;

    }

    public double calcularFrete(){
        if(getKm() == 0){
            this.valorFrete = frete;
            return this.valorFrete;
        }
        if(getKm() >= 10 && getKm() <= 30){
            this.valorFrete = 10 * frete;
            return this.valorFrete;
        }
        if(getKm() > 30 && getKm() <= 50){
            this.valorFrete = 15 * frete;
            return this.valorFrete;
        }
        if (getKm() > 50){
            this.valorFrete = 25 * frete;
            return this.valorFrete;
        }
        return valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }



}
