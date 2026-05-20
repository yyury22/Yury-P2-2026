class Retangulo {
    private double altura = 1.0;
    private double largura = 1.0;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: Altura inválida! Deve ser maior que 0.0 e menor que 20.0.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: Largura inválida! Deve ser maior que 0.0 e menor que 20.0.");
        }
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        System.out.println("=== Valores Padrão ===");
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\n=== Valores Válidos ===");
        retangulo.setAltura(5.5);
        retangulo.setLargura(10.2);
        System.out.println("Nova Altura: " + retangulo.getAltura());
        System.out.println("Nova Largura: " + retangulo.getLargura());
        System.out.println("Nova Área: " + retangulo.calcularArea());
        System.out.println("Novo Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\n=== Testando Validações ===");
        retangulo.setAltura(-2.5);
        retangulo.setLargura(25.0);

        System.out.println("\n=== Estado Final ===");
        System.out.println("Altura final: " + retangulo.getAltura());
        System.out.println("Largura final: " + retangulo.getLargura());
    }
}