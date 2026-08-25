package ads.poo;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private String nome;
    private int carga_horaria;
    private int creditos;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String codigo, String nome, int carga_horaria, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.creditos = creditos;
        this.alunos = new ArrayList<>();
    }

    public boolean matricularAluno(Aluno aluno) {
        if(this.alunos.contains(aluno)){
            return false;
        }
        this.alunos.add(aluno);
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        if(!this.alunos.contains(aluno)){
            return false;
        }
        this.alunos.remove(aluno);
        return true;
    }

    public StringBuilder listarAlunos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Alunos: \n");
        for(Aluno aluno : alunos){
            sb.append(aluno.nome).append("\n");
        }
        return sb;
    }

    public boolean vincularProfessor(Professor professor){
        if(this.professor == null){
            this.professor = professor;
            return true;
        }
        return false;
    }

    public boolean removerProfessor(){
        if(this.professor != null){
            this.professor = null;
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", carga_horaria=" + carga_horaria +
                ", creditos=" + creditos +
                ", professor=" + professor +
                '}';
    }
}
