import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String tentativa = "";
        
        while (!tentativa.equals(senhaCorreta)) {
            tentativa = scanner.nextLine();
        }
        
        System.out.println("Acesso permitido");
        scanner.close();
    }
}