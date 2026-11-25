package BasicoPoo;

class Lampada {
    boolean ligada;

    void ligar() {
        ligada = true;
        System.out.println("A lâmpada está ligada.");
    }

    void desligar() {
        ligada = false;
        System.out.println("A lâmpada está desligada.");
    }
}

public class Exercicio05 {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        lamp.ligar();
        lamp.desligar();
    }
}