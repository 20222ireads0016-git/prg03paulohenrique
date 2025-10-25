/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public abstract class Forma {
    private String tipo;
    
    protected Forma(String tipo){
        setTipo(tipo);
    }
    
    public double obterArea(){
        System.out.println("Algo de errado não esta certo");
        return 0;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
