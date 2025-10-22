/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author paulo
 */
public class PagamentoDinheiro implements Pagamento {
    
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.setValor(valor);
    }
    
    
    @Override
    public double calcularTotal(){
        //Realiza os calculos necessarios de forma bem simples para chegar ao objetivo da atividade, nesse caso aplicase um desconto de 10%
        double valorFinal, desconto;
        
        valorFinal = 0.9 * this.getValor();
        desconto = 0.1 * this.getValor();
        
        imprimirRecibo(valorFinal, desconto, 0, 0);
        
        return valorFinal;
    }
    
    @Override
    public void imprimirRecibo(double valorFinal, double desconto, double taxa, double cashback){
        //Esse metodo chama a JDialog que configurei para aparecer o recibo, sinceramente fiquei com vontade de usar hierarquia aqui, mas não é o objetivo dessa atividade. Sim só copiei e colei essa bagaça em todos...
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