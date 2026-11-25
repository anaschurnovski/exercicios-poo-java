package BasicoPoo;

class Conta {
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
}

public class Exercicio04 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 100.0;

        minhaConta.depositar(250.0);
        System.out.println("Saldo atual: R$ " + minhaConta.saldo);
    }
}