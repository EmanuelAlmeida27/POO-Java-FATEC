// @author 0030482511039 | Emanuel Almeida

package fatec.poo.model;

public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dt, double vht) {
        super(r, n, dt);
        valHorTrab = vht;
    }
    public void setqtdeHorTrab(int q) {
        qtdeHorTrab = q;
    }
    public double calcSalBruto() {
        return valHorTrab * qtdeHorTrab;
    }
    
}