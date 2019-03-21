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
public class Pagamento {
    private Double Valor;
    private String TipoPagamento;
    private String NotaFiscal;

    public Pagamento (Double Valor,String TipoPagamento, String NotaFiscal){
    this.Valor = Valor;
    this.TipoPagamento = TipoPagamento;
    this.NotaFiscal = NotaFiscal;

}
    /**
     * @return the Valor
     */
    public Double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the TipoPagamento
     */
    public String getTipoPagamento() {
        return TipoPagamento;
    }

    /**
     * @param TipoPagamento the TipoPagamento to set
     */
    public void setTipoPagamento(String TipoPagamento) {
        this.TipoPagamento = TipoPagamento;
    }

    /**
     * @return the NotaFiscal
     */
    public String getNotaFiscal() {
        return NotaFiscal;
    }

    /**
     * @param NotaFiscal the NotaFiscal to set
     */
    public void setNotaFiscal(String NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }
}

