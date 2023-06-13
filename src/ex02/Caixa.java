package ex02;

public class Caixa {
    double saldo;

    public Caixa() {
        this.saldo = 1000;
    }

    public void adicionarCredito(double credito) {
        saldo += credito;
    }

    public boolean debitar(double debito) {
        if (debito >= saldo) {
            return false;
        } else {
            saldo -= debito;
            return true;
        }
    }
}
