// @author 0030482511039

public class Aplic {

    public static void main(String[] args) {
        Circulo objCir1 = new Circulo();
        
        objCir1.setRaio(10.0);
        System.out.println("Medida do raio: " + objCir1.getRaio());
        System.out.println("Medida da área: " + objCir1.calcArea());
        System.out.println("Medida do perímetro: " + objCir1.calcPerimetro());
        System.out.println("Medida do diâmetro: " + objCir1.calcDiametro());
    }
}