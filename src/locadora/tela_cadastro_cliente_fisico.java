/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import Cliente.ClienteFisico;
import locadora.Locadora; 

/**
 *
 * @author adolfo
 */
public class tela_cadastro_cliente_fisico extends javax.swing.JInternalFrame
{

    /**
     * Creates new form tela_cadastro_cliente_fisico
     */
    public tela_cadastro_cliente_fisico()
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeClienteFisico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DataCadastroClienteFisico = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        TelefoneClienteFisico = new javax.swing.JFormattedTextField();
        CelularClienteFisico = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CpfCliente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        RGclientefisico = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        CidadeClienteFisico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RuaClienteFisico = new javax.swing.JTextField();
        SalvarClienteFisico = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        EmailClienteFisico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BairroClienteFisico = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CepClienteFisico = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        numeroClienteFisico = new javax.swing.JTextField();
        limparTela = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        avisoClienteFisico = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("Telefone");

        jLabel2.setText("Nome");

        nomeClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nomeClienteFisicoActionPerformed(evt);
            }
        });

        jLabel3.setText("Celular");

        try
        {
            DataCadastroClienteFisico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        jLabel6.setText("Data de cadastro");

        try
        {
            TelefoneClienteFisico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)####-####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        TelefoneClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TelefoneClienteFisicoActionPerformed(evt);
            }
        });

        try
        {
            CelularClienteFisico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)#####-####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        CelularClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CelularClienteFisicoActionPerformed(evt);
            }
        });

        jLabel8.setText("CPF");

        try
        {
            CpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ### - ##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        jLabel9.setText("RG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(TelefoneClienteFisico)
                            .addComponent(CelularClienteFisico, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CpfCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(RGclientefisico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(nomeClienteFisico))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DataCadastroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataCadastroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RGclientefisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel4.setText("Cidade");

        jLabel5.setText("Rua");

        SalvarClienteFisico.setText("Salvar");
        SalvarClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SalvarClienteFisicoActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        EmailClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EmailClienteFisicoActionPerformed(evt);
            }
        });

        jLabel10.setText("Bairro");

        BairroClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BairroClienteFisicoActionPerformed(evt);
            }
        });

        jLabel11.setText("CEP");

        jLabel12.setText("numero");

        numeroClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                numeroClienteFisicoActionPerformed(evt);
            }
        });

        limparTela.setText("Limpar Tela");
        limparTela.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                limparTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EmailClienteFisico, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(CidadeClienteFisico)
                        .addComponent(jLabel5)
                        .addComponent(RuaClienteFisico)
                        .addComponent(jLabel7))
                    .addComponent(limparTela))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(CepClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(numeroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SalvarClienteFisico)
                            .addComponent(BairroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CidadeClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BairroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RuaClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CepClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparTela)
                    .addComponent(SalvarClienteFisico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        avisoClienteFisico.setEditable(false);
        avisoClienteFisico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                avisoClienteFisicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(avisoClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoClienteFisico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nomeClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_nomeClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteFisicoActionPerformed

    private void TelefoneClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TelefoneClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_TelefoneClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneClienteFisicoActionPerformed

    private void CelularClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CelularClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_CelularClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularClienteFisicoActionPerformed

    private void EmailClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EmailClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_EmailClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailClienteFisicoActionPerformed

    private void SalvarClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SalvarClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_SalvarClienteFisicoActionPerformed
        //ClienteFisico cliente = new ClienteFisico();
        //endereco e = new endereco(CidadeCliente.getText(),);
        
        // salvando os dados (atributos) contidos na interface grafica em um novo objeto cliente Fisico

                
        ClienteFisico c1=new ClienteFisico(CpfCliente.getText(),
                RGclientefisico.getText(),
                CelularClienteFisico.getText(), 
                nomeClienteFisico.getText(),
                DataCadastroClienteFisico.getText(),
                TelefoneClienteFisico.getText(),
                CidadeClienteFisico.getText(),
                BairroClienteFisico.getText(),
                CepClienteFisico.getText(), 
                RuaClienteFisico.getText(),
                numeroClienteFisico.getText(), 
                EmailClienteFisico.getText());
          
         
         if(!Locadora.MapaClienteFisicos.VerificaClienteFisico( nomeClienteFisico.getText()))
         {
             Locadora.MapaClienteFisicos.NovoClinte(c1);
             avisoClienteFisico.setText("Cliente cadastrado com sucesso!");
         }
                
          else
              avisoClienteFisico.setText("Cliente já cadastrado !");
          
          //System.out.println(Locadora.MapaClienteFisicos.ConsultaNomeFisico("1"));
         //System.out.println(Locadora.MapaClienteFisicos.listaClientesFisicos());
          //Locadora.MapaClienteFisicos.listaClientesFisicos();
      // Locadora.MapaClienteFisicos.NovoCliente(c1);
          System.out.println(Locadora.MapaClienteFisicos.listaClientesFisicos());     
       
        
        //System.out.println(nomeClienteFisico.getText());

    }//GEN-LAST:event_SalvarClienteFisicoActionPerformed

    private void BairroClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BairroClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_BairroClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroClienteFisicoActionPerformed

    private void numeroClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_numeroClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_numeroClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroClienteFisicoActionPerformed

    private void limparTelaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_limparTelaActionPerformed
    {//GEN-HEADEREND:event_limparTelaActionPerformed

                CpfCliente.setText(null);
                RGclientefisico.setText(null);
                CelularClienteFisico.setText(null);
                nomeClienteFisico.setText(null);
                DataCadastroClienteFisico.setText(null);
                TelefoneClienteFisico.setText(null);   
                CidadeClienteFisico.setText(null);
                BairroClienteFisico.setText(null);
                CepClienteFisico.setText(null);
                RuaClienteFisico.setText(null);
                numeroClienteFisico.setText(null);
                EmailClienteFisico.setText(null);  
                avisoClienteFisico.setText(null);
                
    }//GEN-LAST:event_limparTelaActionPerformed

    private void avisoClienteFisicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_avisoClienteFisicoActionPerformed
    {//GEN-HEADEREND:event_avisoClienteFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avisoClienteFisicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroClienteFisico;
    private javax.swing.JFormattedTextField CelularClienteFisico;
    private javax.swing.JFormattedTextField CepClienteFisico;
    private javax.swing.JTextField CidadeClienteFisico;
    private javax.swing.JFormattedTextField CpfCliente;
    private javax.swing.JFormattedTextField DataCadastroClienteFisico;
    private javax.swing.JTextField EmailClienteFisico;
    private javax.swing.JFormattedTextField RGclientefisico;
    private javax.swing.JTextField RuaClienteFisico;
    private javax.swing.JButton SalvarClienteFisico;
    private javax.swing.JFormattedTextField TelefoneClienteFisico;
    private javax.swing.JTextField avisoClienteFisico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limparTela;
    private javax.swing.JTextField nomeClienteFisico;
    private javax.swing.JTextField numeroClienteFisico;
    // End of variables declaration//GEN-END:variables
}
