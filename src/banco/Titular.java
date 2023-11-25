package banco;

public class Titular {
    private String nome;
    private String celular;

    public Titular(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public String getNome() {
        return nome;
    }
}
