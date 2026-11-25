package BasicoPoo;

class Celular {
    String marca;
    String modelo;

    Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

public class Exercicio09 {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S23");
        System.out.println("Marca: " + celular.marca + " | Modelo: " + celular.modelo);
    }
}