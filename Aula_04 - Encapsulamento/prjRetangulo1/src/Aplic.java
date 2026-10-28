// @author 0030482511039 | Emanuel Almeida
import fatec.poo.model.Retangulo;

public class Aplic {
    public static void main(String[] args) {
        
        Retangulo objRet; // definição do ponteiro
        objRet = new Retangulo(); // Instanciação (alocação) de 
                                  // um objeto da classe Retangulo
                                  
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro " + objRet.calcPerimetro());
        System.out.println("Altura: " + objRet.getAltura());
        System.out.println("Base: " + objRet.getBase());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
        
        Retangulo objRet2 = new Retangulo();
        objRet2.setAltura(3.0);
        objRet2.setBase(4.0);
        
        System.out.println("\n\nMedida da altura: " + objRet2.getAltura());
        System.out.println("Medida da base: " + objRet2.getBase());
        System.out.println("Medida da área: " + objRet2.calcArea());
        System.out.println("Medida do perímetro: " + objRet2.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet2.calcDiagonal());
    }
}