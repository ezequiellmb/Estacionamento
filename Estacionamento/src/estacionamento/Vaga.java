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
public class Vaga {
    private Integer Piso;
    private Integer TamanhoVaga;
    private String Localizacao;
    
    private Veiculo veiculo; 
    
  public Vaga (Integer Piso,Integer TamanhoVaga,String Localizacao ){
      this.Piso = Piso;
      this.TamanhoVaga = TamanhoVaga;
      this.Localizacao = Localizacao;
  }
  public void AdicionaVeiculo(Veiculo veiculo){
      this.veiculo = veiculo;
      
  }
  public void RetiraVeiculo(Veiculo veiculo){
      this.veiculo = null;
      
  }

    /**
     * @return the Piso
     */
    public Integer getPiso() {
        return Piso;
    }

    /**
     * @param Piso the Piso to set
     */
    public void setPiso(Integer Piso) {
        this.Piso = Piso;
    }

    /**
     * @return the TamanhoVaga
     */
    public Integer getTamanhoVaga() {
        return TamanhoVaga;
    }

    /**
     * @param TamanhoVaga the TamanhoVaga to set
     */
    public void setTamanhoVaga(Integer TamanhoVaga) {
        this.TamanhoVaga = TamanhoVaga;
    }

    /**
     * @return the Localizacao
     */
    public String getLocalizacao() {
        return Localizacao;
    }

    /**
     * @param Localizacao the Localizacao to set
     */
    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }
}


