public class Main {

    public static void main(String[] args) {
        int[] meuArray = {10, 45, 2, 88, 15};
        int maior = obterMaiorValor(meuArray);
        
        System.out.println("O maior valor do array é: " + maior);
    }

    public static int obterMaiorValor(int[] numeros) {
        int maior = numeros[0]; 
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}