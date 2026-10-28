// @author 003048211039 | Emanuel Almeida
package fatec.poo.model;

public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String t) {
        super(n, t);
        identificacao = i;
    }
    public void setAreaAtuacao(String i) {
        areaAtuacao = i;
    }
    public int getIdentificacao() {
        return identificacao;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
}