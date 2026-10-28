// @author 0030482511039 | Emanuel Almeida
package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    // criar atributo cargo (feito)
    private String cargo;
    
    public Funcionario(int r, String n, String dt) {
        registro = r;
        nome = n;
        dtAdmissao = dt;
    }
        // exercício
    // implementar getRegistro, getNome, getDtAdmissao (feito)
    public int getRegistro() {
        return registro;
    }
    public String getNome() {
        return nome;
    }
    public String getDtAdmissao() {
        return dtAdmissao;
    }
    // implementar getCargo e setCargo (feito)
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String c) {
        cargo = c;
    }
    abstract public double calcSalBruto();
    public double calcDesconto() {
        return 0.1 * calcSalBruto();
    }
    public double calcSalLiquido() {
        return calcSalBruto() - calcDesconto();
    }

}