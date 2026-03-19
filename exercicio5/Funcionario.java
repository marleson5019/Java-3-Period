package com.mycompany.construtor;

public class Funcionario {
    private int cpf;
    private String nome;
    private double horasTrab;
    private double valorHora;
    private double horExt;

    public Funcionario() {
        this.cpf = 0;
        this.nome = "";
        this.horasTrab = 0.0;
        this.valorHora = 0.0;
        this.horExt = 0.0;
    }

    public void leDados() {
        this.cpf = InOut.leInt("Informe o CPF:");
        this.nome = InOut.leString("Informe o nome:");
        this.horasTrab = InOut.leDouble("Informe horas trabalhadas:");
        this.valorHora = InOut.leDouble("Informe valor da hora:");
        this.horExt = InOut.leDouble("Informe horas extras:");
    }

    public double calculaSalario() {
        return valorHora * (horasTrab + horExt);
    }

        public void MsgdeInforma() {
        String msg = "Cpf: " + cpf +
                     "\nNome: " + nome +
                     "\nHoras Trabalhadas: " + horasTrab +
                     "\nHoras Extras: " + horExt +
                     "\nSalário: " + calculaSalario();
        InOut.MsgDeInforma("Dados do Funcionário", msg);
    }
}
