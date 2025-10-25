/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public class Quadrado extends Forma2D {
    
    public Quadrado(double base, double altura){
        super(base, altura);
    }
    
    @Override
    public String toString(){
        if (getAltura() == getBase()){
            return "Essa forma eh um quadrado";
        } else {
            return "Essa forma eh um retangulo";
        }
    }
    
    @Override
    public double obterArea(){
        //Realiza o calculo da area, por que fiz direto no return? a explicação tá no Circulo, vou copiar nada
        return base * altura;
    }
}
