aimport java.util.Scanner;

public class ContadorCaracteres {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

System.out.print("Digite uma palavra ou frase: ");
String entrada = leitor.nextLine();

// Obtendo o tamanho da string
int tamanho = entrada.length();

// Exibindo o resultado
System.out.println("A palavra \"" + entrada + "\" possui " + tamanho + " caracteres.");

leitor.close();
}
}