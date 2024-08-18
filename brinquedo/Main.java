package brinquedo;

public class Main {
    public static void main(String[] args) {
        
        Brinquedo b1 = new Brinquedo();
        b1.setNome("Carrinho");
        b1.setPreco(25.0f);
        b1.setFaixaEtaria("3 a 5");

        System.out.println("Brinquedo 1: ");
        System.out.println("Nome: " + b1.getNome());
        System.out.println("Preço: " + b1.getPreco());
        System.out.println("Faixa Etária: " + b1.getFaixaEtaria());

        
        Brinquedo b2 = new Brinquedo("Boneca", "6 a 10", 70.0f);

        System.out.println("\nBrinquedo 2:");
        System.out.println("Nome: " + b2.getNome());
        System.out.println("Preço: " + b2.getPreco());
        System.out.println("Faixa Etária: " + b2.getFaixaEtaria());

        
        Brinquedo b3 = new Brinquedo("Quebra-cabeça", "2 a 3", 39.0f);

        System.out.println("\nBrinquedo 3:");
        System.out.println("Nome: " + b3.getNome());
        System.out.println("Preço: " + b3.getPreco());
        System.out.println("Faixa Etária: " + b3.getFaixaEtaria());
    }
}