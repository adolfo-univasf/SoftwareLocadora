/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geradores;

/**
 *
 * @author Jimbreul
 */
public abstract class AGerador implements IGerador {
    
    private String Num,Chassi,Pot,horas,comb;
    private boolean status;

    public AGerador(String Num, String Chassi, String Pot, String horas, String comb, boolean status) {
        this.Num = Num;
        this.Chassi = Chassi;
        this.Pot = Pot;
        this.horas = horas;
        this.comb = comb;
        this.status = status;
    }
abstract void inutilizar();
   
    
    public String getNum() {
        return Num;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public String getPot() {
        return Pot;
    }

    public void setPot(String Pot) {
        this.Pot = Pot;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    
    
}
    
