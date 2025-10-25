/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public class Circulo extends Forma2D {
        
    public Circulo(double base, double altura){
        super(base, altura);
    }
    
    @Override
    public String toString(){
        if (getAltura() == getBase()){
            return "Essa forma eh um circulo";
        } else {
            return "Essa forma eh um elipse";
        }
    }
    
    @Override
    public double obterArea(){
        //Calcula a area da Elipse, logo que estou pedindo base e altura no construtor e sei que o usuário vai digitar valores diferentes então o calculo é de elipse;
        double meiaBase = getBase() / 2;
        double meiaAltura = getAltura() / 2;
        
        
        //Já faz o calculo diretamente no return, por que isso, a resposta é simples, o NetBeans estava reclamando que a variavel area que eu tinha criado era redundante, então deixei assim       
        return Math.PI * meiaBase * meiaAltura;
    }
}
