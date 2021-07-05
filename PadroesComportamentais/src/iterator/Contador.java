package iterator;

import java.util.Iterator;

public class Contador {

    public static Integer contarPessoasVacinadas(Vacina vacina) {
        int quantidade = 0;
        for (Pessoa pessoa : vacina) {
            if (pessoa.isVacinado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalDePessoas(Vacina vacina) {
        int total = 0;
        for (Iterator<Pessoa> a = vacina.iterator(); a.hasNext(); ) {
            total++;
            a.next();
        }
        return total;
    }

}