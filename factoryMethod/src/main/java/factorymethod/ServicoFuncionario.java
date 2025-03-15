package main.java.factorymethod;



public class ServicoFuncionario implements IServico {

    public String executar() {
        return "Funcionario contratado";
    }

    public String cancelar() {
        return "Funcionario Desligado";
    }
}