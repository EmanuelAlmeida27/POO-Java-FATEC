// @author euman

public class main {
    public static void main(String[] args) {
      Retangulo objRet1 = new Retangulo();
      objRet1.setAltura(5.0);
      objRet1.setBase(8.0);
      System.out.println("Área do retangulo: " + objRet1.calcArea());
      System.out.println("Perimetro do retangulo: " + objRet1.calcPerimetro());
    }
}