/* @author 0030482511039 */

public class Exemplo3 {
    public static void main(String[] args) {
        // ----- Estrutura Condicional ----- 
        // Operadores relacionais < > <= >= == !=
        // Operadores lógicos && || !
        
        int i; // Para o loop for
        int num;
        
        num = (int)(Math.random()*100);
        // Método random definido na classe Math 
        
        if (num < 50) {
            System.out.println("O valor " + num + " é menor que 50");
        } else {
            System.out.println("O valor " + num + " é maior ou igual a 50");
        }
        
//        if (1 == 2) {
//            System.out.println("1 é igual a 2");
//        } else if (1 == 1) {
//            System.out.println("1 é igual a 1");
//        } else {
//            System.out.println("1 não é igual a 2");
//        }
//        
//        for (i = 0; i < 11; i++) {
//            System.out.println(i);
//        }
//        
//        System.out.println("----------------------");
//        
//        while (i != 16) {
//            System.out.println(i);
//            i++;
//        }
    }
}