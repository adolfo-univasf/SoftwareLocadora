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
      

    }
   
}
