package com.mycompany.construtor;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.leDados();

        double retirada = InOut.leDouble("Informe a retirada:");
        c.sacar(retirada);

        double deposito = InOut.leDouble("Informe o depósito:");
        c.depositar(deposito);

        InOut.MsgDeInforma("Saldo Atual", "Saldo disponível: " + c.verificarSaldo());
        c.MsgdeInforma();
    }
}
