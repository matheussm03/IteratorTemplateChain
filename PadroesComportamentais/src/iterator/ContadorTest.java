package iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ContadorTest {

	@Test
    void deveContarPessoasVacinadas() {
        Vacina vacina = new Vacina(
                new Pessoa("Ana", true),
                new Pessoa("Beatriz", true),
                new Pessoa("Carlos", false),
                new Pessoa("Debora", true),
                new Pessoa("Eduardo", true)
        );
        assertEquals(4, Contador.contarPessoasVacinadas(vacina));
        
    }

    @Test
    void deveContarTotalPessoasCadastradas() {
        Vacina vacina = new Vacina(
                new Pessoa("Ana", true),
                new Pessoa("Beatriz", true),
                new Pessoa("Carlos", false),
                new Pessoa("Debora", true),
                new Pessoa("Eduardo", true)
        );
        assertEquals(5, Contador.contarTotalDePessoas(vacina));
    }

}