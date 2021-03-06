/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author adolfo
 */
public class Tela_pesquisa_Aluguel_fisico extends javax.swing.JInternalFrame
{

    /**
     * Creates new form Tela_pesquisa_Aluguel_fisico
     */
    public Tela_pesquisa_Aluguel_fisico()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        PesquisarGeradores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Num_Serie = new javax.swing.JTextField();
        limpar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        MostrarDadosGerador = new javax.swing.JButton();
        BotaolistaGeradores = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa Individual"));

        PesquisarGeradores.setText("Pesquisar");
        PesquisarGeradores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PesquisarGeradoresActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de Serie");

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                limparActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(155, 155, 155));
        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });

        MostrarDadosGerador.setText("Mostrar Dados");
        MostrarDadosGerador.setEnabled(false);
        MostrarDadosGerador.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MostrarDadosGeradorActionPerformed(evt);
            }
        });

        BotaolistaGeradores.setText("Listar");
        BotaolistaGeradores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaolistaGeradoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Num_Serie)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(BotaolistaGeradores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MostrarDadosGerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PesquisarGeradores))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Num_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisarGeradores)
                    .addComponent(limpar)
                    .addComponent(MostrarDadosGerador)
                    .addComponent(BotaolistaGeradores))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarGeradoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PesquisarGeradoresActionPerformed
    {//GEN-HEADEREND:event_PesquisarGeradoresActionPerformed
        // TODO add your handling code here:
        //System.out.println("teste");
        //System.out.println(Locadora.MapaClienteFisicos.listaClientesFisicos());

        if(Locadora.MapaGeradores.VerificaGerador(Num_Serie.getText()))
        {
            jTextField1.setText("Gerador cadastrado!");
            MostrarDadosGerador.setEnabled(true);
        }
        else
        {
            jTextField1.setText("Erro Gerador não cadastrado!");
            MostrarDadosGerador.setEnabled(false);
        }
    }//GEN-LAST:event_PesquisarGeradoresActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_limparActionPerformed
    {//GEN-HEADEREND:event_limparActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
        MostrarDadosGerador.setEnabled(false);
    }//GEN-LAST:event_limparActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MostrarDadosGeradorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MostrarDadosGeradorActionPerformed
    {//GEN-HEADEREND:event_MostrarDadosGeradorActionPerformed

        //Tela_cadastro_cliente_juridico TelaCliente_Juridico = new Tela_cadastro_cliente_juridico();
        //Tela_Principal.jDesktopPane1.add(TelaCliente_Juridico);
        // TelaCliente_Juridico.setVisible(true);
    }//GEN-LAST:event_MostrarDadosGeradorActionPerformed

    private void BotaolistaGeradoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaolistaGeradoresActionPerformed
    {//GEN-HEADEREND:event_BotaolistaGeradoresActionPerformed
        Tela_ListaGeradores lista = new Tela_ListaGeradores();
        Tela_Principal.jDesktopPane1.add(lista);
        lista.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaolistaGeradoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaolistaGeradores;
    private javax.swing.JButton MostrarDadosGerador;
    private javax.swing.JTextField Num_Serie;
    private javax.swing.JButton PesquisarGeradores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton limpar;
    // End of variables declaration//GEN-END:variables
}
