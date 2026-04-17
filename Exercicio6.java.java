public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Alê", "Aline", "Clara"};
        
        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith("A")) {
                System.out.println(nome);
            }
        }
    }
}