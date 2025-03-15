package teste.java.factorymethod;


import main.java.factorymethod.IServico;
import main.java.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProdutoTeste {

    @Test
    void deveExecutarProduto() {
        IServico servico = ServicoFactory.obterServico("Produto");
        assertEquals("Produto em  estoque", servico.executar());
    }

    @Test
    void deveCancelarProduto() {
        IServico servico = ServicoFactory.obterServico("Produto");
        assertEquals("Produto fora do estoque", servico.cancelar());
    }

}