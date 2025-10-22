/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author paulo
 */
public interface Pagamento {
    
    public double calcularTotal();
    public void imprimirRecibo(double valorFinal, double desconto, double taxa, double cashback);
    
}