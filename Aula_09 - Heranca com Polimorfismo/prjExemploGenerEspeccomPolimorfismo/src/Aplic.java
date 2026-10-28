// @author 0030482511039 | Emanuel Almeida

import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista objFunc1 = new FuncionarioHorista(1234, "Januário", "32/14/9999", 13.20);
        FuncionarioMensalista objFunc2 = new FuncionarioMensalista(1122, "Abrilsom", "92/22/3004", 300);
        
        objFunc1.setqtdeHorTrab(20);
        System.out.println("Salário Bruto   => " + objFunc1.calcSalBruto());
        System.out.println("Desconto        => " + objFunc1.calcDesconto());
        System.out.println("Salário Líquido => " + objFunc1.calcSalLiquido());
        
        objFunc2.setNumSalMin(10);
        System.out.println("\n\nSalário Bruto   => " + objFunc2.calcSalBruto());
        System.out.println("Desconto        => " + objFunc2.calcDesconto());
        System.out.println("Salário Líquido => " + objFunc2.calcSalLiquido());
    }
}