/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public class Cubo extends Forma3D {
    
    public Cubo(double largura, double comprimento, double altura){
        //Amei hierarquia, aqui simplesmente pega as iformações e coloca nas variaveis fornecidas pela mãe
        super(largura, comprimento, altura);
    }
    
    @Override
    public String toString(){
        if (getAltura() == getComprimento() && getLargura() == getAltura()){
            return "Essa forma eh um cubo";
        } else {
            return "Essa forma eh um Paralelepipedo";
        }
    }
    
    @Override
    public double obterArea(){
        //Inicialmente realiza o calculo parcial de cada um dos retangulos que compoem o paralelepipedo
        double areaBaseTopo = comprimento * largura;
        double areaFrenteTras = comprimento * altura;
        double areaDireitaEsquerda = largura * altura;
        
        //Agora junta todas as 3 areas calculadas logo que o paralelepipedo tem 6 lados sendo os paralelos iguais então multiplico por dois
        double areaTotal = 2 * (areaBaseTopo + areaFrenteTras + areaDireitaEsquerda);
        
        //Isso eu não preciso explicar o que faz...
        return areaTotal;
    }
    
    @Override
    public double obterVolume(){
        //Realiza o calculo do volume do objeto
        return comprimento * largura * altura;
    }
}
