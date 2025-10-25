/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public class Esfera extends Forma3D {
    public Esfera(double largura, double comprimento, double altura){
        super(largura, comprimento, altura);
    }
    
    @Override
    public String toString(){
        if (getAltura() == getComprimento() && getLargura() == getAltura()){
            return "Essa forma eh uma Esfera";
        } else {
            return "Essa forma eh um elipsoide";
        }
    }
    
    @Override
    public double obterArea(){
        //Sinceramente, foi o Gemini que fez esse codigo ai, depois eu tento entender...
        
        // 1. Calcula os semi-eixos
        double a = comprimento / 2.0;
        double b = largura / 2.0;
        double c = altura / 2.0;
    
        // 2. Constante de aproximação (p)
        final double P = 1.6075; 

        // 3. Calcula o numerador da aproximação de Guldberg: (a^p * b^p) + (a^p * c^p) + (b^p * c^p)
        double termo1 = Math.pow(a, P) * Math.pow(b, P);
        double termo2 = Math.pow(a, P) * Math.pow(c, P);
        double termo3 = Math.pow(b, P) * Math.pow(c, P);
    
        double numerador = termo1 + termo2 + termo3;
    
        // 4. Aplica a fórmula completa: S = 4*PI * (numerador / 3)^(1/p)
        double areaSuperficie = 4.0 * Math.PI * Math.pow(numerador / 3.0, (1.0 / P));
    
        return areaSuperficie;
    }
    
    @Override
    public double obterVolume(){
        
        double meioComprimento = comprimento / 2;
        double meiaLargura = largura / 2;
        double meiaAltura = altura / 2;
        
        double volume = (4/3) * Math.PI * meioComprimento * meiaLargura * meiaAltura;
        
        return volume;
    }
}
