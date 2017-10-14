/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluguel;

import Cliente.ClienteJuridico;
import Geradores.Gerador;


public class AluguelJuridico {
  private Gerador ger;
  private ClienteJuridico cli;  
  private String dataaluguel;

    public AluguelJuridico(Gerador ger, ClienteJuridico cli, String dataaluguel) {
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
     public void finalizaraluguel(){ //Finaliza o aluguel criado
    ger.libera();
    System.out.println("Finalizado com sucesso.");
    }
    
    public boolean teste(){
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

    public ClienteJuridico getCli() {
        return cli;
    }

    public void setCli(ClienteJuridico cli) {
        this.cli = cli;
    }

    public String getDataaluguel() {
        return dataaluguel;
    }

    public void setDataaluguel(String dataaluguel) {
        this.dataaluguel = dataaluguel;
    }



}

