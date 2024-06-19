package classes;

import java.util.LinkedList;
import java.util.List;

public class SemestreLetivoLista {
    private List<SemestreLetivo> lista;

    public SemestreLetivoLista() {
        lista = new LinkedList();
    }

    @Override
    public String toString() {
        return "SemestreLetivoLista{" + "lista=" + lista + '}';
    }
    
    public void add(SemestreLetivo d){
        lista.add(d);
    }
    
    public SemestreLetivo get(int i){
        return lista.get(i);
    }
    
    public int size(){
        return lista.size();
    }
    
    public void remove(int index){
        lista.remove(index);
    }
    
    public void alterar(SemestreLetivo d, int i){
        lista.get(i).setAno(d.getAno());
        lista.get(i).setDataFim(d.getDataFim());
        lista.get(i).setDataInicio(d.getDataInicio());
        lista.get(i).setSemestre(d.getSemestre());
    }
    
    public void addDisciplina(Disciplina d, int i){
        lista.get(i).getLista().add(d);
    }
    
    public void removeDisciplina(int semestre, int idxDisc){
        lista.get(semestre).getLista().remove(idxDisc);
    }
    
    public int getQtdDisciplinas(int i){
        return lista.get(i).getLista().size();
    }
    
    public List<SemestreLetivo> getLista(){
        return lista;
    }
    
    
    
}
