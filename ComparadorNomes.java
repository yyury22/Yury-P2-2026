import java.util.Scanner; // 1. Adicione isso no topo

public class ComparadorNomes {
public static void main(String[] args) {
// 2. Adicione esta linha abaixo para criar o "leitor"
Scanner leitor = new Scanner(System.in);

// Agora o resto do seu código vai funcionar!
System.out.print("Digite o primeiro nome: ");
String nome1 = leitor.nextLine();



System.out.print("Digite o segundo nome: ");
String nome2 = leitor.nextLine();

if (nome1.equals(nome2)) {
System.out.println("\nResultado: Os nomes são exatamente iguais!");
} else {
System.out.println("\nResultado: Os nomes são diferentes.");
}

leitor.close();
}
}
