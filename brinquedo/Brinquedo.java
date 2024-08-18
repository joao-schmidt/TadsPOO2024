package brinquedo;
public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    
    public Brinquedo() {
        this.faixaEtaria = "Indefinida";
    }

    public Brinquedo(String nome, String faixaEtaria, float preco) {
        this.nome = nome;
        this.preco = preco;
        setFaixaEtaria(faixaEtaria); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10")
                || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            this.faixaEtaria = "Inválida";
        	}
    	}
	}