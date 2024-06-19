package view.Util;

import classes.Disciplina;
import classes.SemestreLetivo;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;
import view.DisciplinaTADS;

public class SemestreTableModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return DisciplinaTADS.listaSL.size();
    }

    @Override
    public int getColumnCount() {
        return SemestreLetivo.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        SemestreLetivo sl = DisciplinaTADS.listaSL.get(i);
        switch (i1) {
            case 0 -> {
                return sl.getAno();
            }
            case 1 -> {
                return sl.getSemestre();
            }
            case 2 -> {
                return new SimpleDateFormat("dd/MM/yyyy").format(sl.getDataInicio());
            }
            case 3 -> {
                return new SimpleDateFormat("dd/MM/yyyy").format(sl.getDataFim());
            }
            case 4 -> {
                String txt = " ";
                for (int j = 0; j < sl.getLista().size(); j++) {
                    txt += sl.getLista().get(j).getNome() + ", ";
                }
                return txt;
            }
            default -> throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 -> {
                return "Ano";
            }
            case 1 -> {
                return "Semestre";
            }
            case 2 -> {
                return "Data Inicio";
            }
            case 3 -> {
                return "Data Fim";
            }
            case 4 -> {
                return "Disciplinas";
            }
            default -> throw new AssertionError();
        }
    }
    
}
