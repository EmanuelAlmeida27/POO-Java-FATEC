// @author 0030482511039 | Emanuel Almeida

import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;

public class Aplic {
    public static void main(String[] args) {
        
        // Fazer a interação com os métodos getRegistro, getNome, getDtAdmissao, getCargo, calcGratificacao (feito)
        
        FuncionarioHorista objFunc1 = new FuncionarioHorista(1001, "Januário", "11/12/2001", 15);
        objFunc1.setCargo("Programador");
        objFunc1.setqtdeHorTrab(160);
        System.out.println("Registro         => " + objFunc1.getRegistro());
        System.out.println("Nome             => " + objFunc1.getNome());
        System.out.println("Data de Admissão => " + objFunc1.getDtAdmissao());
        System.out.println("Cargo            => " + objFunc1.getCargo());
        System.out.println("Salário Bruto    => " + objFunc1.calcSalBruto() + "R$");
        System.out.println("Desconto         => " + objFunc1.calcDesconto() + "R$");
        System.out.println("Gratificação     => " + objFunc1.calcGratificacao() + "R$");
        System.out.println("Salário Líquido  => " + objFunc1.calcSalLiquido() + "R$");
        
        FuncionarioMensalista objFunc2 = new FuncionarioMensalista(1002, "Abrilsom", "03/03/2003", 1700);
        objFunc2.setCargo("Auxiliar TI");
        objFunc2.setNumSalMin(10);
        System.out.println("\n\nRegistro         => " + objFunc2.getRegistro());
        System.out.println("Nome             => " + objFunc2.getNome());
        System.out.println("Data de Admissão => " + objFunc2.getDtAdmissao());
        System.out.println("Cargo            => " + objFunc2.getCargo());
        System.out.println("Salário Bruto    => " + objFunc2.calcSalBruto() + "R$");
        System.out.println("Desconto         => " + objFunc2.calcDesconto() + "R$");
        System.out.println("Salário Líquido  => " + objFunc2.calcSalLiquido() + "R$"); 
        
        FuncionarioComissionado objFunc3 = new FuncionarioComissionado(1003, "Carlos Silva", "20/06/1998", 10);
        objFunc3.setCargo("Vendedor");
        objFunc3.setSalBase(500);
        objFunc3.addVendas(100000);
        System.out.println("\n\nRegistro         => " + objFunc3.getRegistro());
        System.out.println("Nome             => " + objFunc3.getNome());
        System.out.println("Data de Admissão => " + objFunc3.getDtAdmissao());
        System.out.println("Cargo            => " + objFunc3.getCargo());
        System.out.println("Salário Base     => " + objFunc3.getSalBase());
        System.out.println("Total de Vendas  => " + objFunc3.getTotalVendas());
        System.out.println("Taxa Comissão    => " + objFunc3.getTaxaComissao());
        System.out.println("Salário Bruto    => " + objFunc3.calcSalBruto());
        System.out.println("Desconto         => " + objFunc3.calcDesconto());
        System.out.println("Gratificação     => " + objFunc3.calcGratificacao());
        System.out.println("Salário Líquido  => " + objFunc3.calcSalLiquido());
        
    }
}