/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




//import locadora*;


/**
 *
 * @author adolfo
 */
public class CadastroCliente
{

    /**
     *
     */
    protected Map<String, ClienteFisico> MapaDeClientesFisicos;  

    /**
     *
     */
    protected Map<String, ClienteJuridico> MapaDeClientesJuridicos;

    public CadastroCliente()
    {
        this.MapaDeClientesFisicos = new HashMap<>();
        this.MapaDeClientesJuridicos = new HashMap<>();
    }

 //************************************************ Cadastrar ****************************************************************   
   
    public boolean NovoClinte(ClienteFisico novo)
    {
        boolean cadastroComSucesso;
        
        cadastroComSucesso = MapaDeClientesFisicos.containsKey(novo.getNome()); //retorna verdadeiro caso já esteja cadastrado 
        
        if(!cadastroComSucesso)
        {
            MapaDeClientesFisicos.put(novo.getNome(), novo);
            return cadastroComSucesso;
        } //  (chave, objeto)
        
        return !cadastroComSucesso; // retorna falso caso o cliente já esteja cadastrado (não conseguiu cadastrar)
        
    }
    
    public boolean NovoClinte(ClienteJuridico novo)
    {
        boolean cadastroComSucesso;
        
        cadastroComSucesso = MapaDeClientesJuridicos.containsKey(novo.getNome()); //retorna verdadeiro caso já esteja cadastrado 
        
        if(!cadastroComSucesso)
            MapaDeClientesJuridicos.put(novo.getNome(), novo); //  (chave, objeto)
        
        return !cadastroComSucesso; // retorna falso caso o cliente já esteja cadastrado (não conseguiu cadastrar)
        
    }
    
 //************************************************ Consultar **************************************************************** 
    
    public ClienteJuridico ConsultaFisico(String nome)
    {
        return MapaDeClientesJuridicos.get(nome);
    }
    
    public boolean ConsultaNomeFisico(String nome)
    {
        return MapaDeClientesJuridicos.containsKey(nome);
    }
    //***************************************** 
    public ClienteFisico ConsultaJuridico(String nome)
    {
        return MapaDeClientesFisicos.get(nome);
    }
    
    public boolean ConsultaNomeJuridico(String nome)
    {
        return MapaDeClientesFisicos.containsKey(nome);
    }
    
    
    
    
   public Set<String> listaClientesFisicos()
    {
        
        return MapaDeClientesFisicos.keySet();
      /*for (String key : MapaDeClientesFisicos.keySet()) 
      {              
       //Capturamos o valor a partir da chave
       ClienteFisico value = MapaDeClientesFisicos.get(key);
       System.out.println("key = "+ key + " valor = " + value.getNome());
      }
        */
    } 
          
    
    
    public boolean VerificaClienteFisico(String chave)
    {
        return MapaDeClientesFisicos.containsKey(chave);
    }
    
        public boolean VerificaClienteJuridico(String chave)
    {
        return MapaDeClientesJuridicos.containsKey(chave);
    }
    
   
    
 //************************************************ Excluir ****************************************************************   
    
    public ClienteFisico excluirFisico(String nome)
    {
        return MapaDeClientesFisicos.remove(nome);
    }
            
    public ClienteFisico excluirJuridico(String nome)
    {
        return MapaDeClientesFisicos.remove(nome);
    }
    
    
    
    
}
