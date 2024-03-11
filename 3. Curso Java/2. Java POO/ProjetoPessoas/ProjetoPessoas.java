package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa principal:
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro ");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        p2.setCurso("Informática"); //prox aula iremos alterar o programa
        // para incluir esses dados nas pessoas
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //p1.receberAumento(550.2f); método específico do filho/sub-classe Professor
        //p2.mudarTrabalho(); método específico do filho/sub-classe Funcionario
        //p4.cancelarMatr(); método específico do filho/sub-classe Aluno
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}
