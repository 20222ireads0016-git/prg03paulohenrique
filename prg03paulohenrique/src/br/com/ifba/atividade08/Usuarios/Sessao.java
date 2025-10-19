/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author paulo
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;
    
    private final List<LogAuditoria> historico = new ArrayList<>();

    
    private Sessao(Usuario usuario){
        //Cria uma sessao
        
        setId((long) (Math.random() * 1000) + 1);
        setUsuario(usuario);
        setToken((UUID.randomUUID().toString()));
        this.addHistorico("Sessao: [" + Long.toString(id) + "] Criada", usuario);
    }
    
    public static Sessao iniciarSessao(Usuario usuario, String senha){
        //Verifica se a senha é valida e cria uma sessao
        
        if (senha.equals(usuario.getSenha())){
            Sessao sessao = new Sessao(usuario);
            return sessao;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Sessao: " + Long.toString(this.id) + ", Usuario: [" + this.usuario.getId() + " - " + this.usuario.getNomeUsuario() + "]";
    }
    
    
    //get e set
    public final void addHistorico(String acao, Usuario usuario){
        this.historico.add(new LogAuditoria(acao, usuario));
    }
    
    public final List<LogAuditoria> getHistorico(){
        return this.historico;
    }
    
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public final void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    private void setToken(String token) {
        this.token = token;
    }  
}
