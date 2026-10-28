// @author 0030482511039 | Emanuel Almeida
package fatec.poo.model;

public class Cliente extends Pessoa {
    String cpf;
    double peso, altura;
    
    public Cliente(String c, String n, String t) {
        super(n, t);
        cpf = c;
    }
    public void setPeso(double p) {
        peso = p;
    }
    public void setAltura(double a) {
        altura = a;
    }
    public String getCpf() {
        return cpf;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
}