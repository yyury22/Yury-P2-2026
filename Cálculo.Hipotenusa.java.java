public class Main {

    public static void main(String[] args) {
        double catetoA = 3.0;
        double catetoB = 4.0;
        double resultado = calcularHipotenusa(catetoA, catetoB);
        
        System.out.println("Cateto A: " + catetoA);
        System.out.println("Cateto B: " + catetoB);
        System.out.println("O valor da hipotenusa é: " + resultado);
    }

    public static double calcularHipotenusa(double a, double b) {
        double somaDosQuadrados = (a * a) + (b * b);
        return Math.sqrt(somaDosQuadrados);
    }
}