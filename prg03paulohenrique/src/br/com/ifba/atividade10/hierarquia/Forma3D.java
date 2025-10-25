/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public abstract class Forma3D extends Forma{
    protected double largura;
    protected double comprimento;
    protected double altura;
    
    protected Forma3D(double largura, double comprimento, double altura){
        super("3D");
        setLargura(largura);
        setComprimento(comprimento);
        setAltura(altura);
    }
    
    public double obterVolume(){
        System.out.println("Algo de errado não esta certo");
        return 0;
    }

    public double getLargura() {
        return largura;
    }

    private void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    private void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
