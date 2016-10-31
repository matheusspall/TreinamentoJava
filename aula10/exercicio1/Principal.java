package br.com.meta.aula10.exercicio1;

import br.com.meta.aula10.exercicio1.contato.Agenda;
import br.com.meta.aula10.exercicio1.contato.Contato;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    Agenda agenda = new Agenda();

    public Principal() {
        initComponents();
        preencherTabelaContatos();
    }

    public void preencherTabelaContatos() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Nome", "Telefone", "CPF/CNPJ"});
        for (Contato contato : agenda.getAgenda()) {
            model.addRow(new String[]{contato.getNome(), contato.getTelefone(), contato.getCpfCnpj()});
        }
        jTableContatos.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFCpfCnpj = new javax.swing.JTextField();
        jBtnCancelarAdd = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRBNome = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRBTelefone = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTFNomeConsulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCpfCnpjConsulta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFTelefoneConsulta = new javax.swing.JFormattedTextField();
        jBtnSalvarConsulta = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnCancelarConsulta = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 10 - Agenda de Contatos");
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTableContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CPF/CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContatos.setEnabled(false);
        jScrollPane1.setViewportView(jTableContatos);
        if (jTableContatos.getColumnModel().getColumnCount() > 0) {
            jTableContatos.getColumnModel().getColumn(0).setResizable(false);
            jTableContatos.getColumnModel().getColumn(1).setResizable(false);
            jTableContatos.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel1);

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        try {
            jTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CPF / CNPJ");

        jBtnCancelarAdd.setText("Cancelar");
        jBtnCancelarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarAddActionPerformed(evt);
            }
        });

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnCancelarAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSalvar))
                    .addComponent(jTFCpfCnpj)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCancelarAdd, jBtnSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnCancelarAdd))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Adicionar", jPanel2);

        buttonGroup1.add(jRBNome);
        jRBNome.setSelected(true);
        jRBNome.setText("Nome");

        jLabel5.setText("Pesquisar por:");

        buttonGroup1.add(jRBTelefone);
        jRBTelefone.setText("Telefone");

        jLabel6.setText("Nome");

        jLabel7.setText("CPF / CNPJ");

        jLabel8.setText("Telefone");

        try {
            jTFTelefoneConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBtnSalvarConsulta.setText("Salvar");
        jBtnSalvarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarConsultaActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnCancelarConsulta.setText("Cancelar");
        jBtnCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarConsultaActionPerformed(evt);
            }
        });

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCpfCnpjConsulta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jBtnCancelarConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnSalvarConsulta))
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNomeConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 146, Short.MAX_VALUE))
                            .addComponent(jTFTelefoneConsulta)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBTelefone))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCancelarConsulta, jBtnExcluir, jBtnPesquisar, jBtnSalvarConsulta});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRBNome)
                    .addComponent(jRBTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefoneConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCpfCnpjConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvarConsulta)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnCancelarConsulta))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Editar", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agenda de Contatos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab 1");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        if (!jTFNome.getText().equals("")
                && !jTFTelefone.getText().equals("")
                && !jTFCpfCnpj.getText().equals("")
                && ValidarDados.validarCpfCnpj(jTFCpfCnpj.getText())) {
            Contato contato = new Contato();
            contato.setNome(jTFNome.getText());
            contato.setTelefone(jTFTelefone.getText());
            contato.setCpfCnpj(jTFCpfCnpj.getText());

            agenda.addContato(contato);

            jTFNome.setText("");
            jTFTelefone.setText("");
            jTFCpfCnpj.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        preencherTabelaContatos();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jBtnCancelarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarAddActionPerformed
        jTFNome.setText("");
        jTFTelefone.setText("");
        jTFCpfCnpj.setText("");
    }//GEN-LAST:event_jBtnCancelarAddActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        if (jRBNome.isSelected()) { //pesquisar por nome
            Contato contato = agenda.pesquisarPorNome(jTFNomeConsulta.getText());
            jTFNomeConsulta.setText(contato.getNome());
            jTFTelefoneConsulta.setText(contato.getTelefone());
            jTFCpfCnpjConsulta.setText(contato.getCpfCnpj());
        } else { //pesquisar por telefone
            Contato contato = agenda.pesquisarPorTelefone(jTFTelefoneConsulta.getText());
            jTFNomeConsulta.setText(contato.getNome());
            jTFTelefoneConsulta.setText(contato.getTelefone());
            jTFCpfCnpjConsulta.setText(contato.getCpfCnpj());
        }
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnSalvarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarConsultaActionPerformed
        if (jRBNome.isSelected()) {
            for (Contato contato : agenda.getAgenda()) {
                if (contato.getNome().equals(jTFNomeConsulta.getText())) {
                    contato.setTelefone(jTFTelefoneConsulta.getText());
                    contato.setCpfCnpj(jTFCpfCnpjConsulta.getText());

                    jTFNomeConsulta.setText("");
                    jTFTelefoneConsulta.setText("");
                    jTFCpfCnpjConsulta.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Contato não encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            for (Contato contato : agenda.getAgenda()) {
                if (contato.getTelefone().equals(jTFTelefoneConsulta.getText())) {
                    contato.setNome(jTFNomeConsulta.getText());
                    contato.setCpfCnpj(jTFCpfCnpjConsulta.getText());

                    jTFNomeConsulta.setText("");
                    jTFTelefoneConsulta.setText("");
                    jTFCpfCnpjConsulta.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Contato não encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jBtnSalvarConsultaActionPerformed

    private void jBtnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarConsultaActionPerformed
        jTFNomeConsulta.setText("");
        jTFTelefoneConsulta.setText("");
        jTFCpfCnpjConsulta.setText("");
    }//GEN-LAST:event_jBtnCancelarConsultaActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (jRBNome.isSelected()) {
            for (Contato contato : agenda.getAgenda()) {
                if (contato.getNome().equals(jTFNomeConsulta.getText())) {
                    agenda.removeContato(contato);

                    jTFNomeConsulta.setText("");
                    jTFTelefoneConsulta.setText("");
                    jTFCpfCnpjConsulta.setText("");

                    break;
                }
            }
        } else {
            for (Contato contato : agenda.getAgenda()) {
                if (contato.getTelefone().equals(jTFTelefoneConsulta.getText())) {
                    agenda.removeContato(contato);

                    jTFNomeConsulta.setText("");
                    jTFTelefoneConsulta.setText("");
                    jTFCpfCnpjConsulta.setText("");

                    break;
                }
            }
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileWriter arq = null;
        try {
            arq = new FileWriter("agenda.txt");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("Agenda de Contatos%n");
        for (Contato contato : agenda.getAgenda()) {
            gravarArq.printf(" ---------- ");
            gravarArq.printf("%nNome: " + contato.getNome());
            gravarArq.printf("%nTelefone: " + contato.getTelefone());
            gravarArq.printf("%nCPF/CNPJ: " + contato.getCpfCnpj());
            gravarArq.printf("%n ---------- %n");
        }
        try {
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCancelarAdd;
    private javax.swing.JButton jBtnCancelarConsulta;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JButton jBtnSalvarConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JRadioButton jRBTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCpfCnpj;
    private javax.swing.JTextField jTFCpfCnpjConsulta;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNomeConsulta;
    private javax.swing.JFormattedTextField jTFTelefone;
    private javax.swing.JFormattedTextField jTFTelefoneConsulta;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableContatos;
    // End of variables declaration//GEN-END:variables
}
