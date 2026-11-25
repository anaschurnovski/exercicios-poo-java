package BasicoPoo;

enum Turno {
    MANHA, TARDE, NOITE
}

public class Exercicio10 {
    public static void main(String[] args) {
        for (Turno t : Turno.values()) {
            System.out.println("Turno: " + t);
        }
    }
}