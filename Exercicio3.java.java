import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double litros = scanner.nextDouble();
        char tipo = scanner.next().toUpperCase().charAt(0);
        
        double precoGasolina = 6.00;
        double precoAlcool = 4.50;
        double valorFinal = 0;
        
        if (tipo == 'A') {
            if (litros <= 20) {
                valorFinal = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorFinal = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipo == 'G') {
            if (litros <= 20) {
                valorFinal = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorFinal = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        }
        
        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}