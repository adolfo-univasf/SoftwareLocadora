/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geradores;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jimbreul
 */
public class CadastroGerador {
    
    
    


    /**
     *
     */
    protected Map<String, Gerador> MapaDeGerador;

    public CadastroGerador()
    {
        this.MapaDeGerador = new HashMap<>();
    }

 //************************************************ Cadastrar ****************************************************************   
   
    public boolean NovoGerador(Gerador novo)
    {
        boolean cadastroComSucesso;
        
        cadastroComSucesso = MapaDeGerador.containsKey(novo.getNum_Serie()); //retorna verdadeiro caso já esteja cadastrado 
        
        if(!cadastroComSucesso)
        {
            MapaDeGerador.put(novo.getNum_Serie(), novo);
            return cadastroComSucesso;
        } //  (chave, objeto)
        
        return !cadastroComSucesso; // retorna falso caso o cliente já esteja cadastrado (não conseguiu cadastrar)
        
    }
    
 //************************************************ Consultar **************************************************************** 
    
    public Gerador ConsultaGerador(String nome)
    {
        return MapaDeGerador.get(nome);
    }
    
    public boolean ConsultaNum_Serie(String nome)
    {
        return MapaDeGerador.containsKey(nome);
    }
   
   public Set<String> listaGeradores()
    {
        return MapaDeGerador.keySet();
    } 
   
       
    
    
    public boolean VerificaGerador(String chave)
    {
        return MapaDeGerador.containsKey(chave);
    }
 
    
 //************************************************ Excluir ****************************************************************   
    
    public Gerador excluirGerador(String nome)
    {
        return MapaDeGerador.remove(nome);
    }
   
    
    
    
    
    
    
}
