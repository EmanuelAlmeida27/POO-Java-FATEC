/* @author 0030482511039 */
public class Exemplo8 {
    public static void main(String[] args) {
        int cont;
        double[] matriz;
        double media = 0;
        matriz = new double[10];
        
        for (cont = 0; cont < 10; cont++) {
            matriz[cont] = (double)(Math.random() * 100);
        }
        
        for (cont = 0; cont < 10; cont++) {
            System.out.println("Conteudo de matriz[" + cont + "] = " + matriz[cont]);
        }
        
        for (cont = 0; cont < 10; cont++) {
            media += matriz[cont];
        }
        
        media = media / 10;
        System.out.println("Média aritmética = " + media);
    }
}
