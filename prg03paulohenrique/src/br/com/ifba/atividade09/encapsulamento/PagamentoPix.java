/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author paulo
 */
public class PagamentoPix implements Pagamento {
    
    private double valor;

    public PagamentoPix(double valor) {
        this.setValor(valor);
    }
    
    
    @Override
    public double calcularTotal(){
        //Realiza os calculos necessarios de forma bem simples para chegar ao objetivo da atividade, nesse caso aplicase um cashback de 2% o que tecnicamente não altera o valor final da transação
        double valorFinal, cashback;
        
        valorFinal = getValor();
        cashback = 0.02 * getValor();
        
        imprimirRecibo(valorFinal, 0, 0, cashback);
        
        return valorFinal;
    }
    
    @Override
    public void imprimirRecibo(double valorFinal, double desconto, double taxa, double cashback){
        //Esse metodo chama a JDialog que configurei para aparecer o recibo, sinceramente fiquei com vontade de usar hierarquia aqui, mas não é o objetivo dessa atividade
        ViewRecibo recibo = new ViewRecibo(valor, valorFinal, desconto, taxa, cashback);
        recibo.setVisible(true);
    }

    public double getValor() {
        return valor;
    }

    public final void setValor(double valor) {
        this.valor = valor;
    }    
}