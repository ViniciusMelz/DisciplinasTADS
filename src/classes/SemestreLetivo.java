package classes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SemestreLetivo {
    private int ano;
    private int semestre;
    private Date dataInicio;
    private Date dataFim;
    private List<Disciplina> lista;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Disciplina> getLista() {
        return lista;
    }

    public void setLista(List<Disciplina> lista) {
        this.lista = lista;
    }
    
    public SemestreLetivo(int ano, int semestre, Date dataInicio, Date dataFim) {
        this.ano = ano;
        this.semestre = semestre;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        lista = new LinkedList();
    }

    @Override
    public String toString() {
        return "SemestreLetivo{" + "ano=" + ano + ", semestre=" + semestre + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", lista=" + lista + '}';
    }
    
    
}
