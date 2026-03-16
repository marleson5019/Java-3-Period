package com.mycompany.construtor;

public class Construtor {
    public String cpf;
    public String nome;
    public int horasTrab;
    public double valorHora;
    public int horExt;

    public Construtor() {
        this.cpf = "";
        this.nome = "";
        this.horasTrab = 0;
        this.valorHora = 0.0;
        this.horExt = 0;
    }

    public void leDados() {
        cpf = InOut.leString("Digite o CPF:");
        nome = InOut.leString("Digite o nome:");
        horasTrab = InOut.leInt("Digite as horas trabalhadas:");
        valorHora = InOut.leDouble("Digite o valor da hora:");
        horExt = InOut.leInt("Digite as horas extras:");
    }

    public double calculaSalario() {
        return valorHora * (horasTrab + horExt);
    }

    public void msgDeInforma() {
        String dados = "CPF: " + cpf +
                       "\nNome: " + nome +
                       "\nHoras Trabalhadas: " + horasTrab +
                       "\nHoras Extras: " + horExt +
                       "\nValor da Hora: " + valorHora +
                       "\nSalário: " + calculaSalario();

        InOut.MsgDeInforma("Dados do Funcionário", dados);
    }
}
