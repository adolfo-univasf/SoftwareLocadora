/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import Cliente.CadastroCliente;
import Geradores.CadastroGerador;

/*import Cliente.ClienteFisico;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.util.Set;
*/


/**
 *
 * @author adolfo
 */
public class Locadora
{
   static CadastroCliente MapaClienteFisicos = new CadastroCliente() ;
   static CadastroCliente MapaClienteJuridicos = new CadastroCliente();
   static CadastroGerador MapaGeradores = new CadastroGerador();



     static private Locadora p;
    

   
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
    /**
     *
     */

        Tela_Principal InterfaceGrafica = new Tela_Principal();
        InterfaceGrafica.setVisible(true);
      

       
    //{
        /*Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Tela_Principal().setVisible(true);
            }
        });*/
    }
   
}
