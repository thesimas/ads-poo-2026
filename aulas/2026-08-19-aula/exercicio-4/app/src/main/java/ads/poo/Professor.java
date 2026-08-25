package ads.poo;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<Disciplina> listaDisciplinas;

    public Professor(String nome, int idade) {
        super(nome, idade);
        this.listaDisciplinas = new ArrayList<>();
    }

    public StringBuilder listarDisciplinas(){
        StringBuilder sb = new StringBuilder();
        for(Disciplina discplina : listaDisciplinas){
            sb.append(discplina.getNome()).append("\n");
        }
        return sb;
    }

    public boolean addDisciplina (Disciplina disciplina){
        if(listaDisciplinas.contains(disciplina)){
            return false;
        }
        this.listaDisciplinas.add(disciplina);
        return true;
    }

    public boolean removeDiscplina (Disciplina disciplina){
        if(!listaDisciplinas.contains(disciplina)){
            this.listaDisciplinas.add(disciplina);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "listaDisciplinas=" + listaDisciplinas +
                '}';
    }
}
