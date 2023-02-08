
package visao;

import controle.CinemaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cinemas;
import modelo.Utilitarios;



public class frmCinema extends javax.swing.JFrame{
    
    public void listar(){
        CinemaDAO dao = new CinemaDAO();
        List<Cinemas> lista = dao.listarCinema();
        
         DefaultTableModel dados = (DefaultTableModel) tbCine.getModel();
        dados.setNumRows(0);
        
        for (Cinemas c: lista){
            dados.addRow(new Object[]{
            c.getCodigo(),
            c.getNomeFantasia(),
            c.getRua(),
            c.getCidade(),
            c.getBairro(),
            c.getEstado(),
            c.getLotacao(),
            
        });
    }
}
public frmCinema() {
        initComponents();
    }

/*
public class CadastroCinema extends javax.swing.JFrame {

  
    public CadastroCinema() {
        initComponents();
   }

   */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtLotacao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tbCinema = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnPesquisaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCine = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPesquisa = new javax.swing.JTextPane();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Cliente ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));

        painel_dados.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Código:");

        jLabel3.setText("NomeFantasia");

        jLabel4.setText("Rua");

        jLabel5.setText("Cidade:");

        jLabel6.setText("Bairro");

        jLabel7.setText("Estado");

        jLabel9.setText("Lotacao");

        txtCodigo.setEditable(false);
        txtCodigo.setName("txtCodigo"); // NOI18N

        txtNomeFantasia.setForeground(new java.awt.Color(0, 0, 102));
        txtNomeFantasia.setToolTipText("");
        txtNomeFantasia.setName("txtNomeFantasia"); // NOI18N

        txtRua.setForeground(new java.awt.Color(0, 0, 102));
        txtRua.setName("txtRua"); // NOI18N

        txtCidade.setForeground(new java.awt.Color(0, 0, 102));
        txtCidade.setName("txtCidade"); // NOI18N

        txtBairro.setForeground(new java.awt.Color(0, 0, 102));
        txtBairro.setName("txtBairro"); // NOI18N

        txtEstado.setForeground(new java.awt.Color(0, 0, 102));
        txtEstado.setName("txtEstado"); // NOI18N

        txtLotacao.setForeground(new java.awt.Color(0, 0, 102));
        txtLotacao.setName("txtLotacao"); // NOI18N

        jLabel11.setText("pessoas");

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(txtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados", painel_dados);

        tbCinema.setBackground(new java.awt.Color(204, 204, 255));
        tbCinema.setName("tbCinema"); // NOI18N
        tbCinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCinemaMouseClicked(evt);
            }
        });

        jLabel10.setText("Nome:");

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.setName("btnPesquisaCliente"); // NOI18N
        btnPesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisaClienteMouseClicked(evt);
            }
        });
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        tbCine.setForeground(new java.awt.Color(0, 0, 102));
        tbCine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "NomeFantasia", "Rua", "Cidade", "Bairro", "Estado", "Loatacao"
            }
        ));
        tbCine.setName("tbCine"); // NOI18N
        tbCine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCine);

        txtPesquisa.setForeground(new java.awt.Color(0, 0, 102));
        txtPesquisa.setName("txtPesquisa"); // NOI18N
        jScrollPane2.setViewportView(txtPesquisa);

        javax.swing.GroupLayout tbCinemaLayout = new javax.swing.GroupLayout(tbCinema);
        tbCinema.setLayout(tbCinemaLayout);
        tbCinemaLayout.setHorizontalGroup(
            tbCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbCinemaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tbCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(tbCinemaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisaCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tbCinemaLayout.setVerticalGroup(
            tbCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbCinemaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(tbCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(btnPesquisaCliente))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Dados", tbCinema);

        btSalvar.setBackground(new java.awt.Color(153, 153, 255));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 0, 102));
        btSalvar.setLabel("Salvar");
        btSalvar.setName("btSalvar"); // NOI18N
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(153, 153, 255));
        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 0, 102));
        btEditar.setLabel("Editar");
        btEditar.setName("btEditar"); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(153, 153, 255));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 0, 102));
        btExcluir.setLabel("Excluir");
        btExcluir.setName("btExcluir"); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btSalvar)
                        .addGap(41, 41, 41)
                        .addComponent(btEditar)
                        .addGap(50, 50, 50)
                        .addComponent(btExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        Cinemas obj = new Cinemas();
        
        obj.setNomeFantasia(txtNomeFantasia.getText());
        obj.setRua(txtRua.getText());
        obj.setCidade(txtCidade.getText());
        obj.setBairro(txtBairro.getText());
        obj.setEstado(txtEstado.getText());
        obj.setLotacao(Integer.parseInt(txtLotacao.getText()));
        
        CinemaDAO dao = new CinemaDAO();
        dao.cadastrarCinema(obj);
         new Utilitarios().LimparTela(painel_dados);
    }//GEN-LAST:event_btSalvarMouseClicked

    private void tbCineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCineMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        
        txtCodigo.setText(tbCine.getValueAt(tbCine.getSelectedRow(),0).toString());
        txtNomeFantasia.setText(tbCine.getValueAt(tbCine.getSelectedRow(),1).toString());
        txtRua.setText(tbCine.getValueAt(tbCine.getSelectedRow(),2).toString());
        txtCidade.setText(tbCine.getValueAt(tbCine.getSelectedRow(),3).toString());
        txtBairro.setText(tbCine.getValueAt(tbCine.getSelectedRow(),4).toString());
        txtEstado.setText(tbCine.getValueAt(tbCine.getSelectedRow(),5).toString());
        txtLotacao.setText(tbCine.getValueAt(tbCine.getSelectedRow(),6).toString());
        
    }//GEN-LAST:event_tbCineMouseClicked

    private void tbCinemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCinemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCinemaMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
     Cinemas obj = new Cinemas();
        
        obj.setNomeFantasia(txtNomeFantasia.getText());
        obj.setRua(txtRua.getText());
        obj.setCidade(txtCidade.getText());
        obj.setBairro(txtBairro.getText());
        obj.setEstado(txtEstado.getText());
        obj.setLotacao(Integer.parseInt(txtLotacao.getText()));
        
        obj.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        CinemaDAO dao = new CinemaDAO();
        dao.alterarCinema(obj);
        new Utilitarios().LimparTela(painel_dados);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Cinemas obj = new Cinemas();
        
        obj.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        CinemaDAO dao =new CinemaDAO();
        
        dao.excluirCinema(obj);
         new Utilitarios().LimparTela(painel_dados);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed

    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnPesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisaClienteMouseClicked
        String nomefantasia = "%" + txtPesquisa.getText()+ "%";
        CinemaDAO dao = new CinemaDAO();
        List<Cinemas> lista = dao.buscaCinemaPorNome(nomefantasia);

        DefaultTableModel dados = (DefaultTableModel) tbCine.getModel();
        dados.setNumRows(0);
        
        for (Cinemas c: lista){
            dados.addRow(new Object[]{
                c.getCodigo(),
                c.getNomeFantasia(),
                c.getRua(),
                c.getCidade(),
                c.getBairro(),
                c.getEstado(),
                c.getLotacao(),
            });
                 
    }//GEN-LAST:event_btnPesquisaClienteMouseClicked
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tbCine;
    private javax.swing.JPanel tbCinema;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLotacao;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextPane txtPesquisa;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
