/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public abstract class Forma2D extends Forma {
    protected double base;
    protected double altura;
    
    protected Forma2D(double base, double altura){
        super("2D");
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    private void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }
}
