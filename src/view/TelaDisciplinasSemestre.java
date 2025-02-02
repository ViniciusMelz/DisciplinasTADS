/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import classes.SemestreLetivo;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class TelaDisciplinasSemestre extends javax.swing.JFrame {
    private int indice = -1;
    private DefaultListModel lista = new DefaultListModel();

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
        
        SemestreLetivo d = DisciplinaTADS.listaSL.get(indice);
        int semestre = d.getSemestre();
        
        jlblSemestreLetivo.setText("Semestre Letivo: " + d.getAno() + " - " + d.getSemestre());
        jlblDatas.setText(new SimpleDateFormat("dd/MM/yyyy").format(d.getDataInicio()) + " até " + new SimpleDateFormat("dd/MM/yyyy").format(d.getDataFim()));
        
        
        for (int j = 0; j < DisciplinaTADS.listaD.size(); j++) {
            if(semestre == DisciplinaTADS.listaD.get(j).getSemestre() || (semestre + 2) == DisciplinaTADS.listaD.get(j).getSemestre()){
            jcbSelecionarDisciplinas.addItem(DisciplinaTADS.listaD.get(j).getSemestre() + "º Sem.: " + DisciplinaTADS.listaD.get(j).getNome());
            }
        }
        
        for (int i = 0; i < d.getLista().size(); i++) {
            lista.addElement( d.getLista().get(i).getSemestre() + "º Sem.: " + d.getLista().get(i).getNome());
            jltListaDisciplinas.setModel(lista);
        }
        
        
        
    }
    /**
     * Creates new form TelaDisciplinasSemestre
     */
    public TelaDisciplinasSemestre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblSemestreLetivo = new javax.swing.JLabel();
        jlblDatas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcbSelecionarDisciplinas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jltListaDisciplinas = new javax.swing.JList<>();
        jbtnAdicionar = new javax.swing.JButton();
        jbtnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Disciplinas do Semestre");

        jlblSemestreLetivo.setText("Semestre Letivo: xxxx - x");

        jlblDatas.setText("xx/xx/xxxx até xx/xx/xxxx");

        jLabel1.setText("Disciplina:");

        jcbSelecionarDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar..." }));

        jScrollPane1.setViewportView(jltListaDisciplinas);

        jbtnAdicionar.setText("Adicionar");
        jbtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarActionPerformed(evt);
            }
        });

        jbtnRemover.setText("Remover");
        jbtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnRemover)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblSemestreLetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(jlblDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSelecionarDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlblSemestreLetivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblDatas)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSelecionarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRemover)
                    .addComponent(jbtnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarActionPerformed
        SemestreLetivo d = DisciplinaTADS.listaSL.get(indice);
        boolean jaTem = false;
        int posicao = 0;
        if(jcbSelecionarDisciplinas.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione uma Disciplina Válida!");
            jcbSelecionarDisciplinas.requestFocus();
        }else{
            for (int i = 0; i < d.getLista().size(); i++) {
                String disciplina = d.getLista().get(i).getSemestre() + "º Sem.: " + d.getLista().get(i).getNome();
                if(disciplina.equals(jcbSelecionarDisciplinas.getSelectedItem())){
                    jaTem = true;
                    break;
                }else{
                    jaTem = false;
                }
            }
            if(jaTem == false){
                for (int i = 0; i < DisciplinaTADS.listaD.size(); i++) {
                    String disciplina = DisciplinaTADS.listaD.get(i).getSemestre() + "º Sem.: " + DisciplinaTADS.listaD.get(i).getNome();
                    if(disciplina.equals(jcbSelecionarDisciplinas.getSelectedItem())){
                        posicao = i;
                        break;
                    }
                }
                DisciplinaTADS.listaSL.addDisciplina(DisciplinaTADS.listaD.get(posicao), indice);
                lista.addElement( jcbSelecionarDisciplinas.getSelectedItem());
                jltListaDisciplinas.setModel(lista);
            }else{
                JOptionPane.showMessageDialog(null, "A disciplina selecionada já está presente na lista, selecione outra!");
                jcbSelecionarDisciplinas.requestFocus();
            }
            
        }
    }//GEN-LAST:event_jbtnAdicionarActionPerformed

    private void jbtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoverActionPerformed
        if(jltListaDisciplinas.getSelectedIndex() >= 0){
            int result = JOptionPane.showConfirmDialog(null, "Tem Certeza?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                DisciplinaTADS.listaSL.getLista().get(indice).getLista().remove(jltListaDisciplinas.getSelectedIndex());
                lista.remove(jltListaDisciplinas.getSelectedIndex());
                jltListaDisciplinas.setModel(lista);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Para remover selecione a disciplina na lista!");
        }
    }//GEN-LAST:event_jbtnRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinasSemestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinasSemestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinasSemestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinasSemestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDisciplinasSemestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnRemover;
    private javax.swing.JComboBox<String> jcbSelecionarDisciplinas;
    private javax.swing.JLabel jlblDatas;
    private javax.swing.JLabel jlblSemestreLetivo;
    private javax.swing.JList<String> jltListaDisciplinas;
    // End of variables declaration//GEN-END:variables
}
