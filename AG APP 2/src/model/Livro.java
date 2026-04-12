package model;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private double preco;

    // Construtor padrão
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.ano = 0;
        this.preco = 0.0;
    }

    // Construtor parametrizado
    public Livro(String titulo, String autor, int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setAno(ano);
        setPreco(preco);
    }

    // Getters e Setters com validação
    public String getTitulo() {
        return titulo;
    }

     public String getAutor() {
        return autor;
    }

     public int getAno() {
        return ano;
    }

        public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        }
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }


    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    // Método específico 1
    public double aplicarDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }

    // Método específico 2
    public boolean ehAntigo() {
        return ano < 2000;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Livro: " + titulo +  "  Autor: " + autor +  "  Ano: " + ano + "  Preço: R$ " + preco;
    }
}