package fatec.poo.model;


public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dt, double tc) {
        super(r, n, dt);
        taxaComissao = tc;
    }
    public void setSalBase(double s) {
        salBase = s;
    }
    public double getSalBase() {
        return salBase;
    }
    public double getTotalVendas() {
        return totalVendas;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void addVendas(double v) {
        totalVendas += v;
    }
    public double calcSalBruto() {
        return salBase + (taxaComissao / 100) * totalVendas;
    }
    public double calcGratificacao() {
        if (totalVendas <= 5000) {
            return 0;
        } else if (totalVendas <= 10000) {
            return calcSalBruto() * 0.03;
        } else {
            return calcSalBruto() * 0.05;
        }
    }
    public double calcSalLiquido() {
        return calcSalBruto() - calcDesconto() + calcGratificacao();
    }
}