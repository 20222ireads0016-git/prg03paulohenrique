/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia;

/**
 *
 * @author paulo
 */
public class Piramide extends Forma3D {
    
    public Piramide(double largura, double comprimento, double altura){
        super(largura, comprimento, altura);
    }
    
    @Override
    public String toString(){
        return "Essa forma eh uma piramide";
    }
    
    @Override
    public double obterArea(){
        //Gemini fez esse aqui tbm, mas esse deu para entender a logica do calculo, eu acho...
        
        // 1. ÁREA DA BASE (Ab)
        double areaBase = comprimento * largura;
    
        // 2. CÁLCULO DAS ALTURAS LATERAIS (Apótemas)
    
        // Altura da face que tem o COMPRIMENTO como base
        // Usa a altura central e METADE da largura
        double metadeLargura = largura / 2.0;
        double h_comp = Math.sqrt(Math.pow(altura, 2) + Math.pow(metadeLargura, 2));

        // Altura da face que tem a LARGURA como base
        // Usa a altura central e METADE do comprimento
        double metadeComprimento = comprimento / 2.0;
        double h_larg = Math.sqrt(Math.pow(altura, 2) + Math.pow(metadeComprimento, 2));
    
        // 3. ÁREA LATERAL (AL) - Soma dos 4 triângulos
    
        // Área dos 2 triângulos do comprimento: 2 * (base * altura / 2)
        double areaLateralComp = comprimento * h_comp; // O 2/2 se cancela
    
        // Área dos 2 triângulos da largura: 2 * (base * altura / 2)
        double areaLateralLarg = largura * h_larg; // O 2/2 se cancela
    
        double areaLateralTotal = areaLateralComp + areaLateralLarg;
    
        // 4. ÁREA TOTAL (AT = Ab + AL)
        double areaTotal = areaBase + areaLateralTotal;

        return areaTotal;
    }
    
    @Override
    public double obterVolume(){
        
        double areaBase = comprimento * largura;
        
        double volume = (areaBase * altura) / 3;
        
        return volume;
    }
}
