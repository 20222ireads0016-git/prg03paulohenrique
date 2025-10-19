/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Usuarios;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */

public class Usuario {
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
    
    private final List<LogAuditoria> historico = new ArrayList<>();

    
    public Usuario(String nomeUsuario, String email, String senha) {
        //Realiza o cadastro do usuário, simplesmente atribui as informações
        
        this.setNomeUsuario(nomeUsuario);
        this.setEmail(email);
        this.setSenha(senha);
        this.setId((long) (Math.random() * 1000) + 1);
        this.setAtivo(true);
        this.addHistorico("Usuario [" + id + "] criado.", null); //Cria um log da criação do usuário
    }
    
    @Override
    public String toString() {
        //Incialmente verifica o status para converter de boolean para string e posteriormente retorna as informações como string
        
        String resStatus;
        
        if (isAtivo()){
            resStatus = "Ativo";
        } else {
            resStatus = "Inativo";
        }
        
        return "Usuario: " + getNomeUsuario() + ", ID [" + Long.toString(getId()) + "], E-mail: " + getEmail() + ", Ultimo Login: " + getUltimoLogin() + ", Staus: " + resStatus + ", Perfil: " + getPerfil().toString();
    }
    
    public final void addHistorico(String acao, Usuario usuario){
        //adiciona um registro ao historico
        this.historico.add(new LogAuditoria(acao, usuario));
    }
    
    public final List<LogAuditoria> getHistorico(){
        //Lista os registros do historico de usuário
        return this.historico;
    }
    
    
    //Get e set
    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
        this.addHistorico("Perfil: " + perfil.getId() + "atribuido ao usuario" + this.getId(), null);
        
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public final void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public final void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public final void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
