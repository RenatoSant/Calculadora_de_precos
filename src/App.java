
import calculo.*;
public class App {
         public static void main(String[] args) {
        CalculoPreco valor1 = new CalculoPreco();
        valor1.setPreco(115.95); valor1.setKm(85);
        valor1.calcularFrete(); valor1.calcularDesconto(); valor1.calcularPreco();
             System.out.println(valor1.toString());
    }
}
