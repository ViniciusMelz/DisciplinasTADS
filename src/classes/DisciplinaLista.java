package classes;

import java.util.LinkedList;
import java.util.List;

public class DisciplinaLista {
    private List<Disciplina> list;

    public DisciplinaLista() {
        list = new LinkedList<>();
    }
    
    public void add(Disciplina d){
        list.add(d);
    }
    
    public Disciplina get(int i){
        return list.get(i);
    }
    
    public void alterar(Disciplina d, int i){
        list.get(i).setNome(d.getNome());
        list.get(i).setProfessor(d.getProfessor());
        list.get(i).setHoras(d.getHoras());
        list.get(i).setSemestre(d.getSemestre());
    }
    
    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < list.size(); i++) {
            texto += list.get(i).toString();
        }
        return texto;
    }
    
    public void remove(int index){
        list.remove(index);
    }
    
    
}
