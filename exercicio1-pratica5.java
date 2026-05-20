import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU LISTA DE COMPRAS ===");
            System.out.println("1. Adicionar");
            System.out.println("2. Listar");
            System.out.println("3. Remover");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    lista.add(item);
                    System.out.println("Item adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- Itens da Lista ---");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.print("Digite o índice do item a ser removido: ");
                        int indice = scanner.nextInt();

                        if (indice >= 0 && indice < lista.size()) {
                            lista.remove(indice);
                            System.out.println("Item removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}