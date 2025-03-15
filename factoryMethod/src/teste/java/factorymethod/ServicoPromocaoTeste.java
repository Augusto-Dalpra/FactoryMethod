package teste.java.factorymethod;


import main.java.factorymethod.IServico;
import main.java.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPromocaoTeste {

    @Test
    void deveExecutarPromocao() {
        IServico servico = ServicoFactory.obterServico("Promocao");
        assertEquals("Promoção criada", servico.executar());
    }

    @Test
    void deveCancelarPromocao() {
        IServico servico = ServicoFactory.obterServico("Promocao");
        assertEquals("Promoção acabada", servico.cancelar());
    }

}