package locadorageradores;

import Aluguel.AluguelFisico;
import Aluguel.AluguelJuridico;
import Cliente.ClienteFisico;
import Cliente.ClienteJuridico;
import Geradores.Gerador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jimbreul
 */
public class Locadorageradores {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        
       System.out.println("EXEMPLOS >>> LEIA OS COMENTARIOS NO CODIGO");
     //abaixo serao instanciados novos clientes e um gerador para teste demonstrativo
     
     ClienteJuridico cj1=new ClienteJuridico("CNPJaqui", "NOMEaqui", "DATACADASTROaqui", "TELEFONEAQUI","CIDADEaqui","BAIRROaqui","CEPaqui", "RUAaqui", "NUMEROaqui", "EMAILAQUI");
     ClienteFisico c1=new ClienteFisico("CPFaqui", "RGaqui", "CELULARaqui", "NOMEaqui", "DATACADASTROaqui", "TELEFONEAQUI","CIDADEaqui","BAIRROaqui","CEPaqui", "RUAaqui", "NUMEROaqui", "EMAILAQUI");
     Gerador g1=new Gerador("NUMERODOGERADORaqui","CHASSIaqui", "POTENCIAaqui", "HORASDETRABALHOaqui", "TIPODECOMBUSTIVELaqui", true);
        System.out.println(cj1.getCnpj()); //demonstrando cnpj do objeto ClienteJuridico criado
        System.out.println(cj1.getEnd().getBairro());//demonstrando bairro do objeto ClienteJuridico criado
        System.out.println(c1.getCpf());//demonstrando cpf do objeto ClienteFisico criado
        System.out.println(c1.getEnd().getBairro());//demonstrando bairro do objeto ClienteFisico criado
        
        AluguelJuridico aj1=new AluguelJuridico(g1,cj1,"DIADOALUGUEL");//Criando um aluguel
        aj1.completaraluguel(); //completando o aluguel
        AluguelFisico af1=new AluguelFisico(g1,c1,"DIADOALUGUEL");//tentando fazer aluguel com o gerador 1 alugado
        af1.completaraluguel(); //tentando completar o aluguel(nao consegue pq o gerador está alugado)
        aj1.finalizaraluguel();//finalizando o aluguel no primeiro gerador
        af1.completaraluguel();//completando o aluguel novamente pois o gerador ja estava liberado
        System.out.println("LEIA ATENTAMENTE OS COMENTARIOS");
    }
    */
}
