import java.util.Scanner;

public class ComparadorCaseInsensitive {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

System.out.println("--- Comparador de Palavras (Ignorando Case) ---");

// Entrada de dados
System.out.print("Digite a primeira palavra: ");
String p1 = leitor.nextLine();

System.out.print("Digite a segunda palavra: ");
String p2 = leitor.nextLine();

// Comparação usando equalsIgnoreCase()
if (p1.equalsIgnoreCase(p2)) {
System.out.println("\nAs palavras são iguais (mesmo que as letras variem entre maiúsculas/minúsculas).");
} else {
System.out.println("\nAs palavras são diferentes.");
}

leitor.close();
}
}
