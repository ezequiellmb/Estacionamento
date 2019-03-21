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
public class Moto extends Veiculo {
    private String guidao;
    public Moto (String cor,String placa, String modelo,String guidao){
        super(cor, placa, modelo);
        this.guidao = guidao;
    }

    /**
     * @return the guidao
     */
    public String getGuidao() {
        return guidao;
    }

    /**
     * @param guidao the guidao to set
     */
    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }
    
    
}
