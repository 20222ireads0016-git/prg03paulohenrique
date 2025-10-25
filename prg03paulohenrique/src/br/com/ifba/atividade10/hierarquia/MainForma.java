/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public abstract class MainForma {
    public static void main(String[] args) {
        Forma[] formas = new Forma[12];
        
        //Cria as formas
        Circulo circulo1 = new Circulo(5,5);
        Cubo cubo1 = new Cubo(5,5,5);
        Esfera esfera1 = new Esfera(5,5,5);
        Piramide piramide1 = new Piramide(5,5,5);
        Quadrado quadrado1 = new Quadrado(5,5);
        Triangulo triangulo1 = new Triangulo(5,5);
        Circulo circulo2 = new Circulo(3,8);
        Cubo cubo2 = new Cubo(6,7,5);
        Esfera esfera2 = new Esfera(6,7,2);
        Piramide piramide2 = new Piramide(9,6,4);
        Quadrado quadrado2 = new Quadrado(3,7);
        Triangulo triangulo2 = new Triangulo(6,7);
        
        //Atribui ao vetor
        formas[0] = circulo1;
        formas[1] = cubo1;
        formas[2] = esfera1;
        formas[3] = piramide1;
        formas[4] = quadrado1;
        formas[5] = triangulo1;
        formas[6] = circulo2;
        formas[7] = cubo2;
        formas[8] = esfera2;
        formas[9] = piramide2;
        formas[10] = quadrado2;
        formas[11] = triangulo2;        
                
        //identifica se é algum tipo de forma que possui de volume, se não só mostra a area
        for (int i = 0; i < 12; i++){
            if(formas[i] instanceof Cubo){
                Cubo cubo = (Cubo) formas[i];
                System.out.println(cubo.toString() + ", seu volume eh: " + Double.toString(cubo.obterVolume())+ ", sua area eh: " + Double.toString(cubo.obterArea()));
            } else if (formas[i] instanceof Piramide){
                Piramide piramide = (Piramide) formas[i];
                System.out.println(piramide.toString() + ", seu volume eh: " + Double.toString(piramide.obterVolume())+ ", sua area eh: " + Double.toString(piramide.obterArea()));
            } else if(formas[i] instanceof Esfera){
                Esfera esfera = (Esfera) formas[i];
                System.out.println(esfera.toString() + ", seu volume eh: " + Double.toString(esfera.obterVolume())+ ", sua area eh: " + Double.toString(esfera.obterArea()));             
            } else {
                System.out.println(formas[i].toString() + ", a area eh: " + formas[i].obterArea());
            }
        }
    }    
}
