package view.Util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class DisciplinaCellRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent c = (JComponent) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JLabel cl = (JLabel) c;
        
        //TESTANDO A COLUNA
        
        switch(column){
            case 0 -> {
                cl.setBackground(Color.LIGHT_GRAY);
                cl.setFont(cl.getFont().deriveFont(Font.BOLD));
                cl.setHorizontalAlignment(CENTER);
                break;
            }
            case 1 -> {
                cl.setBackground(Color.WHITE);
                cl.setHorizontalAlignment(CENTER);
                break;
            }
            case 2 -> {
                cl.setHorizontalAlignment(CENTER);
                break;
            }
            case 3 -> {
                cl.setBackground(new Color(0xF3D8C7));
                cl.setHorizontalAlignment(CENTER);
                break;
            }
            default -> throw new AssertionError();
        }
        return cl;
    }
    
}
