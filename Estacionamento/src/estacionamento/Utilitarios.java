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
public class Utilitarios extends Veiculo {
    private Integer tamanhoU;
    public Utilitarios(String cor,String placa, String modelo,Integer tamanhoU){
        super(cor,placa,modelo);
        this.tamanhoU = tamanhoU;
    }

    /**
     * @return the tamanhoU
     */
    public Integer getTamanhoU() {
        return tamanhoU;
    }

    /**
     * @param tamanhoU the tamanhoU to set
     */
    public void setTamanhoU(Integer tamanhoU) {
        this.tamanhoU = tamanhoU;
    }
    
    
}
