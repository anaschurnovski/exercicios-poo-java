package BasicoPoo;

class Aluno {
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}

public class Exercicio06 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nota1 = 7.5;
        aluno.nota2 = 8.5;

        System.out.println("Média do aluno: " + aluno.calcularMedia());
    }
}