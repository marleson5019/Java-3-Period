package com.mycompany.construtor;

public class ContaBancaria {
    private int numero;
    private int agencia;
    private String cliente;
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria() {
        this.numero = 0;
        this.agencia = 0;
        this.cliente = "";
        this.saldo = 0.0;
        this.chequeEspecial = 0.0;
    }

    public void leDados() {
        this.numero = InOut.leInt("Informe o número da conta:");
        this.agencia = InOut.leInt("Informe a agência:");
        this.cliente = InOut.leString("Informe o nome do cliente:");
        this.saldo = InOut.leDouble("Informe o saldo:");
        this.chequeEspecial = InOut.leDouble("Informe o cheque especial:");
    }

    public void sacar(double retirada) {
        double totalDisponivel = saldo + chequeEspecial;
        if (retirada <= totalDisponivel) {
            if (retirada <= saldo) {
                saldo -= retirada;
            } else {
                retirada -= saldo;
                saldo = 0;
                chequeEspecial -= retirada;
            }
        } else {
            InOut.MsgDeErro("Erro", "Saldo insuficiente!");
        }
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public double verificarSaldo() {
        return saldo + chequeEspecial;
    }

    public void MsgdeInforma() {
        String msg = "Conta: " + numero +
                     "\nAgência: " + agencia +
                     "\nCliente: " + cliente +
                     "\nSaldo: " + saldo +
                     "\nCheque Especial: " + chequeEspecial;
        InOut.MsgDeInforma("Dados da Conta", msg);
    }
}
