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
public class ClienteFisico extends Acliente{
    private String cpf;
    private String rg;
    

    public ClienteFisico(String cpf, String rg, String celular, String nome, String DataCadastro, String telefone, String cidade, String bairro, String cep, String rua, String numero, String email) {
        super(nome, DataCadastro, telefone,celular, cidade, bairro, cep, rua, numero, email);
        this.cpf = cpf;
        this.rg = rg;
    }

 
    
    

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    @Override
    public void aluga()
    {
        
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }


    
}
