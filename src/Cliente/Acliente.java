/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;
import locadorageradores.endereco;

/**
 *
 * @author adolfo
 */
public abstract class Acliente implements Icliente
{
    private String nome;
    private endereco end; //agregação da classe endereco
    private String DataCadastro;
    private String telefone;

    public Acliente(String nome, String DataCadastro, String telefone,String cidade, String bairro, String cep, String rua, String numero, String email) {
        this.nome = nome;
        this.DataCadastro = DataCadastro;
        this.telefone = telefone;
        this.end = new endereco(cidade,bairro,cep,rua,numero,email);
    }

    

    
    
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getDataCadastro()
    {
        return DataCadastro;
    }

    public void setDataCadastro(String DataCadastro)
    {
        this.DataCadastro = DataCadastro;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
   
     public endereco getEnd() {
        return end;
    }

    public void setEnd(endereco end) {
        this.end = end;
    }
    
    
}
