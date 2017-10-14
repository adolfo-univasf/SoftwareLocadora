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
public class Gerador extends AGerador {

    private boolean funcional; //varivel que indica se o gerador está ou nao funcional

    public Gerador(String Num, String Chassi, String Pot, String horas, String comb, boolean status) {
        super(Num, Chassi, Pot, horas, comb, status);
        this.funcional = true;
    }
    public void reativar(){ //Reativa um gerador que antes estava com defeito
         this.setFuncional(true);
    }
    @Override //Polimorfirmo de sobreposição
    void inutilizar() { //indica que um gerador está quebrado
        this.setFuncional(false);
    }

    @Override //Polimorfirmo de sobreposição
    public void aluga() { //muda o status para alugado
        this.setStatus(false);
    }

    @Override //Polimorfirmo de sobreposição
    public void libera() { //muda o status para liberado(paraque possa ser alugado)
                this.setStatus(true);
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    
    

}
