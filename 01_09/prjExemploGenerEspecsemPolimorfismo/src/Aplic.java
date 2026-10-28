// @author 0030482511039 | Emanuel Almeida

import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

public class Aplic {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno(1010, "Januário maio", "32/13/9999");
        Professor objProfessor = new Professor(9876, "Feveireisom", "33/122/3000");

        objAluno.setMensalidade(10000);
        System.out.printf("\nRegistro escolar: %d", objAluno.getRegEscolar());
        System.out.println("\nNome: " + objAluno.getNome());
        System.out.println("Data de nascimento: " + objAluno.getDataNascimento());
        System.out.println("Valor da mensalidade: " + objAluno.getMensalidade());
        
        objProfessor.setSalario(10.5);
        System.out.println("\nRegistro funcional: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salário: " + objProfessor.getSalario());
    }
}