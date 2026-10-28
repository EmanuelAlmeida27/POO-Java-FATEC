// @author 0030482511039 | Emanuel Almeida

import java.util.Scanner;
import fatec.poo.model.Circulo;

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo objCir1 = new Circulo();
        
        double medRaio;
        int opcao;
        
        System.out.println("Digite o valor do Raio: ");
        medRaio = entrada.nextDouble();
        
        objCir1.setRaio(medRaio);
        
        do {
            System.out.println("\n\n[1] - Consultar Área");
            System.out.println("[2] - Consultar Perímetro");
            System.out.println("[3] - Consultar Diametro");
            System.out.println("[4] - Sair");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Medida do Raio: " + objCir1.getRaio());
                if (opcao == 1) {
                    System.out.println("Medida da Área: " + objCir1.calcArea());
                } else if (opcao == 2) {
                    System.out.println("Medida do Perímetro: " + objCir1.calcPerimetro());
                } else {
                    System.out.println("Medida do Diametro: " + objCir1.calcDiametro());
                }
            } else {
                break;
            }
        } while (true);
    }
}