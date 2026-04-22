public class Main {

    public static void main(String[] args) {
        int[] numerosParaContar = {1, 2, 3, 4, 5, 6, 8};
        
        int[] resultado = contarParesImpares(numerosParaContar);
        
        System.out.println("Quantidade de números Pares: " + resultado[0]);
        System.out.println("Quantidade de números Ímpares: " + resultado[1]);
    }

    public static int[] contarParesImpares(int[] numeros) {
        int qtdPares = 0;
        int qtdImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                qtdPares++; 
            } else {
                qtdImpares++; 
            }
        }
        
        return new int[]{qtdPares, qtdImpares};
    }
}