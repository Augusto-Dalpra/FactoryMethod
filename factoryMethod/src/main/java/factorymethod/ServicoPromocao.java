package main.java.factorymethod;


public class ServicoPromocao implements IServico {

    public String executar() {
        return "Promoção criada";
    }

    public String cancelar() {
        return "Promoção acabada";
    }
}