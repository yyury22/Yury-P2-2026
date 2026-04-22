public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz"};
        String busca = "Carlos";
        
        boolean encontrou = elementoExiste(nomes, busca);
        
        if (encontrou) {
            System.out.println("A palavra '" + busca + "' existe no array.");
        } else {
            System.out.println("A palavra '" + busca + "' NÃO existe no array.");
        }
    }

    public static boolean elementoExiste(String[] array, String busca) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(busca)) {
                return true; 
            }
        }
        return false; 
    }
}