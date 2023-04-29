package modelo;

public class Conta {
    private boolean ativo = false;
    private double saldo = 0.00;

    public boolean ativar (){
        this.ativo = true;
        return ativo;
    }

    public boolean depositar(double valor){
        if (ativo){
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() { return this.saldo; }

    public boolean sacar(double valor) {
        if (ativo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean inativar() {
        this.ativo = false;
        return ativo;
    }
}
