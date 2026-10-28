// @author 0030482511039 | Emanuel Almeida

package fatec.poo.model;

public class Professor extends Pessoa{ // "extends Pessoa" indica a relação de herança 
                                       // entre a classe Pessoa (super-classe) e a Professor (sub-classe)
    private int regFuncional;
    private double salario;
    
    public Professor(int rf, String n, String dt) {
        super(n, dt); // Chamada do método construtor da super classe Pessoa
        regFuncional = rf;
    }
    public void setSalario(double s) {
        salario = s;
    }
    public int getRegFuncional() {
        return regFuncional;
    }
    public double getSalario() {
        return salario;
    }
}