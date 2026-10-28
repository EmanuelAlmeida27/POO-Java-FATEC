/* @author 0030482511039 */

public class Exemplo6 {
    public static void main(String[] args) {
        int cont = 1, num;
        
        num = (int)(Math.random() * 100);
        System.out.println("\t\t\tTABUADA DO " + num); 
         
        do {
            System.out.println(num + " + " + cont + " = " + cont * num);
            cont += 1;
        } while (cont <= 10);
    }
}