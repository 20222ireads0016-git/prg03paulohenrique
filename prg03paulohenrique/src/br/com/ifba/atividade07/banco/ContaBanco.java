/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.banco;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author paulo
 */

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void ContaBanco(String dono, int numConta){
        //Realiza a construção da conta atribuindo os valores necessários
        setDono(dono);
        setNumConta(numConta +1);
        setStatus(false);
        setSaldo(0);
    }
    
    //Adicionei retorno para algumas funcões, por padrão -1 significa erro e 0 sucesso
    
    public int abrirConta(String tipo){
        /*Realiza a abertura da conta comparando se a mesma já foi fechada e qual o tipo desejado, 
        tem um erro na logica da questão nessa parte, pois o cliente poderia abrir a conta sacar o saldo 
        fechar a conta e abri-la novamente recebendo o bonus novamente, eu queria ter esse banco*/
        
        if (isStatus() == false && tipo.equals("cp")){
            setSaldo(150);
        } else if (isStatus() == false && tipo.equals("cc")){
            setSaldo(50);
        } else {
            return -1;
        }
        
        setStatus(true);
        return 0;
    }
    
    public int fecharConta(){
        //Verifica se o status é verdadeiro e se o saldo da conta está zerado
        
        if (isStatus() && this.saldo == 0){
            setStatus(false);
        } else {
            return -1;
        }
        
        return 0;
    }
    
    public int depositar(double valor){
        //Realiza o deposito do valor, comparando se o status da conta é valido
        double saldoAtual = getSaldo();
        
        if (isStatus()){
            setSaldo(saldoAtual + valor);
        } else {
            return -1;
        }
        
        return 0;
    }
    
    public int sacar(double valor){
        //Realiza o saque do valor, comparando se o status da conta é valido e se o saldo é suficiente
        double saldoAtual = getSaldo();
        
        if (isStatus() && getSaldo() > valor){
            setSaldo(saldoAtual - valor);
        } else {
            return -1;
        }        
        return 0;
    }
    
    public int pagarMensal(){
        /*Realiza o pagamento mensal de manuntenção da conta comparando status tipo de conta e o sado atual,
        o valor da mensalidade é meio caro, mas se levar em consideração o bug de abrirConta, vale a pena*/
        double saldoAtual = getSaldo();
        
        if (isStatus() && tipo.equals("cp") && saldoAtual > 20){
            setSaldo(saldoAtual - 20);
        } else if (isStatus() && tipo.equals("cc") && saldoAtual > 12){
            setSaldo(saldoAtual - 12);
        } else {
            return -1;
        }
        
        setStatus(true);
        return 0;
    }

    //metodos get e set, tem segredo aqui não
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
