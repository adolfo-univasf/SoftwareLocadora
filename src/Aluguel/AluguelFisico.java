/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluguel;

import Cliente.ClienteFisico;
import Geradores.Gerador;


public class AluguelFisico {
   private Gerador ger;
   private ClienteFisico cli; 
   private String dataaluguel;

    public AluguelFisico(Gerador ger, ClienteFisico cli, String dataaluguel) {
        this.ger = ger;
        this.cli = cli;
        this.dataaluguel = dataaluguel;
    }

   
   
   
    public void completaraluguel(){//Completa o aluguel criado
    if(teste()){
    ger.aluga();
    System.out.println("Concluido com sucesso.");
    }
    else{
        System.out.println("Aluguel nao pode ser finalizado");
    }
    }
     public void finalizaraluguel(){//finaliza o aluguel criado
    ger.libera();
    System.out.println("Finalizado com sucesso.");
    }
    
    public boolean teste(){//Metodo de teste ele testa se o gerador pode ou nao ser alugado.
    if(ger.isFuncional()==true){
        if(ger.isStatus()==true){
            return true;
            }
    }
    else{
    return false;
    }
    return false;
    }
     public Gerador getGer() {
        return ger;
    }

    public void setGer(Gerador ger) {
        this.ger = ger;
    }

    public ClienteFisico getCli() {
        return cli;
    }

    public void setCli(ClienteFisico cli) {
        this.cli = cli;
    }

    public String getDataaluguel() {
        return dataaluguel;
    }

    public void setDataaluguel(String dataaluguel) {
        this.dataaluguel = dataaluguel;
    }

} 
   
    