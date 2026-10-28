package fatec.poo.model;

// @author 0030482511039

public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dt, double vsm) {
        super(r, n, dt);
        valSalMin = vsm;
    }
    public void setNumSalMin(double s) {
        numSalMin = s;
    }
    public double calcSalBruto() {
        return valSalMin * numSalMin;
    }
}
