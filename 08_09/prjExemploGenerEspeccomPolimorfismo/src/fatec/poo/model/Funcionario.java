// @author 0030482511039 | Emanuel Almeida
package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    
    public Funcionario(int r, String n, String dt) {
        registro = r;
        nome = n;
        dtAdmissao = dt;
    }
    abstract public double calcSalBruto();
    public double calcDesconto() {
        return 0.1 * calcSalBruto();
    }
    public double calcSalLiquido() {
        return calcSalBruto() - calcDesconto();
    }
}