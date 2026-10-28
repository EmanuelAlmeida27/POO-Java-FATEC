// @author 0030482511039 | Emanuel Almeida
import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;

public class Aplic {
    public static void main(String[] args) {
        Instrutor objInstrutor = new Instrutor(1234, "NAA", "22-11234-1200");
        Cliente objCliente = new Cliente("12345678900", "OOM", "33-12345-1234");
        
        objInstrutor.setAreaAtuacao("Não faço ideia");
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Area de atuação: " + objInstrutor.getAreaAtuacao());
        
        objCliente.setPeso(2.3);
        objCliente.setAltura(150.5);
        System.out.println("\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso() + "mg");
        System.out.println("Altura: " + objCliente.getAltura() + "cm");
    }
}