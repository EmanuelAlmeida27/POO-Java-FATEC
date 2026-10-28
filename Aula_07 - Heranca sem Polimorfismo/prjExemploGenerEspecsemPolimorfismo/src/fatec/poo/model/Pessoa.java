package fatec.poo.model;

//@author 0030482511039 | Emanuel Almeida

public class Pessoa {
    private String nome;
    private String dataNascimento;
    
    public Pessoa(String n, String dn) {
        nome = n;
        dataNascimento = dn;
    }
    public String getNome() {
        return nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }  
}