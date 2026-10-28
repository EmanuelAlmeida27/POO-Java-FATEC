import java.util.Scanner;
import fatec.poo.model.Retangulo;

// @author 0030482511039 | Emanuel Almeida
 
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
//        int a;
//        double b;
//        String c;
//        
//        a = entrada.nextInt();
//        b = entrada.nextDouble();
//        c = entrada.next();
//        
//        System.out.println("Valor de a: " + a);
//        System.out.println("Valor de b: " + b);
//        System.out.println("Valor de c: " + c);

        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet1 = new Retangulo();
        
        objRet1.setAltura(medAlt);
        objRet1.setBase(medBase);
        
        do {
            System.out.println("\n\n[1] - Consultar Área");
            System.out.println("[2] - Consultar Perímetro");
            System.out.println("[3] - Consultar Diagonal");
            System.out.println("[4] - Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Medida da Altura: " + objRet1.getAltura());
                System.out.println("Medida da Base: " + objRet1.getBase());
                if (opcao == 1) {
                    System.out.println("Medida da Área: " + objRet1.calcArea());
                } else if (opcao == 2) {
                    System.out.println("Medida do Perímetro: " + objRet1.calcPerimetro());
                } else {
                    System.out.println("Medida da Diagonal: " + objRet1.calcDiagonal());
                }
//                    switch (opcao) {
//                    case 1:
//                        System.out.println("Medida da Área: " + objRet1.calcArea());
//                        break;
//                    case 2:
//                        System.out.println("Medida do Perímetro: " + objRet1.calcPerimetro());
//                        break;
//                    default:
//                        System.out.println("Medida da Diagonal: " + objRet1.calcDiagonal());
//                        break;
//                }
            } else {
                break;
            }
            
        } while (true);
    }
}