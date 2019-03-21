/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author UniCesumar
 */
public class Carro extends Veiculo{
    private Integer lugares;
    public Carro (String cor,String placa, String modelo,Integer lugares){
        super(cor,placa,modelo);
        this.lugares = lugares;
    }

    /**
     * @return the lugares
     */
    public Integer getLugares() {
        return lugares;
    }

    /**
     * @param lugares the lugares to set
     */
    public void setLugares(Integer lugares) {
        this.lugares = lugares;
    }
        
   
}
