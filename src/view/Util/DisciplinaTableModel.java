package view.Util;

import classes.Disciplina;
import javax.swing.table.AbstractTableModel;
import view.DisciplinaTADS;

public class DisciplinaTableModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return DisciplinaTADS.listaD.size();
    }

    @Override
    public int getColumnCount() {
        return Disciplina.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Disciplina d = new DisciplinaTADS().listaD.get(i);
        switch (i1) {
            case 0 -> {
                return d.getNome();
            }
            case 1 -> {
                return d.getProfessor();
            }
            case 2 -> {
                return d.getHoras();
            }
            case 3 -> {
                return d.getSemestre();
            }
            default -> throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 -> {
                return "Nome";
            }
            case 1 -> {
                return "Professor";
            }
            case 2 -> {
                return "Horas";
            }
            case 3 -> {
                return "Semestre";
            }
            default -> throw new AssertionError();
        }
    }
    
    
    
}
