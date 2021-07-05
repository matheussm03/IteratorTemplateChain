package iterator;

public class Pessoa {

    private String nome;
    private boolean vacinado;

    public Pessoa(String nome, boolean vacinado) {
        this.nome = nome;
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
}
