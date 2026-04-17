public class Votacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 16) {
            System.out.println("Você ainda não pode votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Seu voto é FACULTATIVO (não obrigatório).");
        } else {
            System.out.println("Seu voto é OBRIGATÓRIO.");
        }
        
        scanner.close();
    }
}