package BasicoPoo;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 80.0);
        Produto p2 = new Produto("Teclado", 150.0);
        Produto p3 = new Produto("Monitor", 900.0);

        Produto maisCaro = p1;

        if (p2.preco > maisCaro.preco) {
            maisCaro = p2;
        }
        if (p3.preco > maisCaro.preco) {
            maisCaro = p3;
        }

        System.out.println("O produto mais caro é: " + maisCaro.nome + " custando R$ " + maisCaro.preco);
    }
}