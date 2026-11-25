package BasicoPoo;

class Curso {
    String nome;
    int cargaHoraria;

    Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
}

public class Exercicio08 {
    public static void main(String[] args) {
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", 2400);
        System.out.println("Curso: " + curso.nome + " | Carga Horária: " + curso.cargaHoraria + "h");
    }
}