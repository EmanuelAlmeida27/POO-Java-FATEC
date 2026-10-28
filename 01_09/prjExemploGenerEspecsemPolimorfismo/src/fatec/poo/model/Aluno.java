// @author 0030482511039
package fatec.poo.model;

public class Aluno extends Pessoa{ // "extends Pessoa" indica a relação de herança 
                                       // entre a classe Pessoa (super-classe) e a Professor (sub-classe)
    private int regEscolar;
    private double mensalidade;
    
    public Aluno(int re, String n, String dn) {
        super(n, dn); //Chamada do método construtor da classe Pessoa
        regEscolar = re;
    }
    public void setMensalidade(double x) {
        mensalidade = x;
    }
    public int getRegEscolar() {
        return regEscolar;
    }
    public double getMensalidade() {
        return mensalidade;
    }
}