package main.java.factorymethod;



public class ServicoProduto implements IServico {

    public String executar() {
        return "Produto em  estoque";
    }

    public String cancelar() {
        return "Produto fora do estoque";
    }
}