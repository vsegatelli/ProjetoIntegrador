package br.com.digitalhouse;

import java.util.List;

public class Livro {

    public int codigo;
    public String titulo;
    public String autor;
    public String anolacamento;
    public String isbn;
    public int quantidadeEstoque;
    public double preco;

    List<Livro> listaLivraria = (List<Livro>) new Livro();


    public Livro() {
    }

    public Livro(int codigo, String titulo, String autor, String anolacamento, String isbn, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anolacamento = anolacamento;
        this.isbn = isbn;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnolacamento() {
        return anolacamento;
    }

    public void setAnolacamento(String anolacamento) {
        this.anolacamento = anolacamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrar(Livro livro) {

        listaLivraria.add(livro);
    }


    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anolacamento='" + anolacamento + '\'' +
                ", isbn='" + isbn + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                '}';
    }

    public void consultar(int novoCodigo) {
        boolean achou = false;
        for (Livro lista : listaLivraria) {
            if (lista.getCodigo() == novoCodigo) {
                achou = true;
                System.out.println(getCodigo());
            }
        }

        if (!achou) {
            System.out.println("Livro não cadastrado");
        }
    }

    public void vendas(int novoCodigo) {
        for (Livro vendido : listaLivraria) {
            if (vendido.getCodigo() == novoCodigo) {
                listaLivraria.remove(vendido);
                System.out.println("Livro vendido");
            }

            if (vendido.getQuantidadeEstoque() == 0) {
                System.out.println("Estoque esgotado!");
            }

        }
    }

    

}