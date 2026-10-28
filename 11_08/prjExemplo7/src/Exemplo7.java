/* @author 0030482511039 */

public class Exemplo7 {
    public static void main(String[] args) {
        int[] tabNum; //Declaração
        int cont;
        
        tabNum = new int[3]; //Criação
        // new é um comando de alocação, similar a malloc da linguagem C.
        
        tabNum[0] = 34;
        tabNum[1] = 18;
        tabNum[2] = 27;
        
        for (cont = 0; cont < 3; cont++) {
            System.out.println("Conteudo de tabNum[" + cont + "] = " + tabNum[cont]);
            //System.out.println(tabNum[cont]);
        }
    } 
}