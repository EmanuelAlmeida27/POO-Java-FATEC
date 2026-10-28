/* @author 0030482511039 */

public class Exemplo5 {
    public static void main(String[] args) {
        
        int cont = 1, num;

        num = (int) (Math.random() * 100);
        System.out.println("\t\t\tTABUADA DO " + num);         

        while (cont <= 10) {
            System.out.println(num + " + " + cont + " = " + cont * num);
            cont++; // cont += 1
        }
    }
}
