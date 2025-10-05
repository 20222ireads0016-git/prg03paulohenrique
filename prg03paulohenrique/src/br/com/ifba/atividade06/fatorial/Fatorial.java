/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.fatorial;

/**
 *
 * @author paulo
 */

public class Fatorial {
    
    static int valor;
    
    public static void setValor(int n){
        //Apenas atribui a variavel. PS: estou me perguntando se esse metodo realemente é necessário...
        valor = n;
    }
    
    public static int getFatorial(){
        
        //Inicia a variavel resVetorial com o valor 1 por causa da convenção 0! = 1;
        int resFatorial = 1;
        
        //Faz o calculo do faturial, analisando bem o calculo é feito de traz para frente, mas tá de boa pois a ordem dos fatores não altera o resultado;
        for(int i = 1; i <= valor; i++){
            resFatorial = resFatorial * i;
        }
        return resFatorial;
    }
    
    public static String getFormula(){
        
        //Inicializa a varivel, basicamente é para o primeiro elemento da formula aparecer isolado, ou seja, sem o x " x 5";
        String formula = Integer.toString(valor);
        
        //Maquina de escrever, para a formula, decrementando para ficar bonitinho, e valor-1 por que já coloquei o primeiro elemento ali em cima;
        for (int i = valor - 1; i > 0; i--){
            formula += " x " + i;
        }
        return formula;
    }
}
