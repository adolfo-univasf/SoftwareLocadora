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
public class ClienteJuridico extends Acliente
{
    private String cnpj;

    public ClienteJuridico(String cnpj,String celular, String nome, String DataCadastro, String telefone, String cidade, String bairro, String cep, String rua, String numero, String email) {
        super(nome, DataCadastro, telefone,celular, cidade, bairro, cep, rua, numero, email);
        this.cnpj = cnpj;
    }

    
    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    @Override
    public void aluga()
    {
        
    }
    
}
