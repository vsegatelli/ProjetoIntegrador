package br.com.digitalhouse;

import java.util.*;

public class Livraria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        Livro livro1 = new Livro(12345, "Poemas", "José Abreu", "Setembro de 1980", "AB123", 76, 27.00);
        Livro livro2 = new Livro(2365, "Biografia", "Maria Jose", "Janeiro de 1955", "CB123", 66, 25.99);
        Livro livro3 = new Livro(2342, "Históridas da Cidade", "Ricardo José", "Fevereiro de 1960", "AB009", 55, 22.99);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        System.out.println("Os livros cadastrados são:" + livros);

        livro.consultar(123);
        livro.vendas(345);




    }
}
