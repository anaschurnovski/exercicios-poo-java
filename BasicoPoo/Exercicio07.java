package BasicoPoo;

class Livro {
    String titulo;
    boolean disponivel = true;

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    void devolver() {
        disponivel = true;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }
}

public class Exercicio07 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Java para Iniciantes";

        livro.emprestar();
        livro.emprestar();
        livro.devolver();
    }
}
