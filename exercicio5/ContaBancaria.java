package com.mycompany.construtor;

public class ContaBancaria {
    private String numero;
    private String agencia;
    private String cliente;
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria() {
        this.numero = "";
        this.agencia = "";
        this.cliente = "";
        this.saldo = 0.0;
        this.chequeEspecial = 0.0;
    }

    public void leDados() {
        numero = InOut.leString("Digite o número da conta:");
        agencia = InOut.leString("Digite a agência:");
        cliente = InOut.leString("Digite o nome do cliente:");
        saldo = InOut.leDouble("Digite o saldo inicial:");
        chequeEspecial = InOut.leDouble("Digite o valor do cheque especial:");
    }

    public void sacar(double retirada) {
        if (retirada <= saldo + chequeEspecial) {
            saldo -= retirada;
            InOut.MsgDeInforma("Operação de Saque", 
                "Saque de R$ " + retirada + " realizado com sucesso.\nSaldo atual: R$ " + saldo);
        } else {
            InOut.MsgDeErro("Erro de Saque", 
                "Saldo insuficiente! Tentativa de saque: R$ " + retirada);
        }
    }

    public void depositar(double deposito) {
        saldo += deposito;
        InOut.MsgDeInforma("Depósito", 
            "Depósito de R$ " + deposito + " realizado.\nSaldo atual: R$ " + saldo);
    }

    public double verificarSaldo() {
        return saldo + chequeEspecial;
    }

    @Override
    public String toString() {
        return "Número: " + numero +
               "\nAgência: " + agencia +
               "\nCliente: " + cliente +
               "\nSaldo: " + saldo +
               "\nCheque Especial: " + chequeEspecial +
               "\nSaldo disponível: " + verificarSaldo();
    }

    public void msgDeInforma() {
        InOut.MsgDeInforma("Dados da Conta", this.toString());
    }
}
