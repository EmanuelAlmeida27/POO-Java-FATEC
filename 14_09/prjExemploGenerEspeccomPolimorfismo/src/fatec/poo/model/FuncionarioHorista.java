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
    
    // Aplicando polimorfismo
    public double calcSalBruto() {
        return valHorTrab * qtdeHorTrab;
    }
    // implementar método calcGratificacao e novo calcSalLiquido (feito)
    public double calcGratificacao() {
        return calcSalBruto() * 0.075;
    }
    public double calcSalLiquido() {
        //return calcSalBruto() - calcDesconto() + calcGratificacao();
        return super.calcSalLiquido() + calcGratificacao();
    }
    
}