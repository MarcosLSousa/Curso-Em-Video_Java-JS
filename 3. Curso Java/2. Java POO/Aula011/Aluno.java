package aula011;
//public final class Aluno extends Pessoa { (se colocarmos final nessa classe, a classe Bolsista não vai poder herdá-la)
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    //public final void pagarMensalidade() { (se colocarmos final nesse método, a classe Bolsista não vai poder herdá-la)
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
