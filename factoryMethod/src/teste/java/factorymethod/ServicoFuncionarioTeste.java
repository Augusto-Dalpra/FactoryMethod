package teste.java.factorymethod;


import main.java.factorymethod.IServico;
import main.java.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFuncionarioTeste {

    @Test
    void deveExecutarFuncionario() {
        IServico servico = ServicoFactory.obterServico("Funcionario");
        assertEquals("Funcionario contratado", servico.executar());
    }

    @Test
    void deveCancelarFuncionario() {
        IServico servico = ServicoFactory.obterServico("Funcionario");
        assertEquals("Funcionario Desligado", servico.cancelar());
    }

}