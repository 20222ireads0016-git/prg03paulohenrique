/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Usuarios;
import java.time.LocalDateTime;

/**
 *
 * @author paulo
 */
public class LogAuditoria {
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    
    public LogAuditoria(String acao, Usuario usuario) {
        //Cria um log
        
        setId((long) (Math.random() * 1000) + 1);
        setIp("123.456.789"); //Preguiça de pegar o ip certo
        setUsuario(usuario); //Atribui o objeto Usuario ao Log
        setAcao(acao);
        setDataHora(LocalDateTime.now());
    }
    
    @Override
    public String toString() {
        return "Registro Log: " + Long.toString(getId()) + "Usuario: [" + getUsuario().getId() + ", " + getUsuario().getNomeUsuario() + "], Acao: " + getAcao() + ", IP: " + getIp();
    }
    
    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    private void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    private void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    private void setIp(String ip) {
        this.ip = ip;
    }
}