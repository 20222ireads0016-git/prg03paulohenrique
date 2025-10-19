/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Usuarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */

public class PerfilUsuario {
    private long id;
    private String descricao;
    private final List<String> permissoes = new ArrayList<>();

    
    public PerfilUsuario(String descricao, String permissao){
        setDescricao(descricao);
        addPermissao(permissao);
        setId((long) (Math.random() * 1000) + 1);
    }
    
    @Override
    public String toString() {
        //Deu um trabalhinho fazer essas permissões serem listadas corretamente, espero que aproveite
        
        String listPerm = "\n[";
        for(String list : permissoes){
            listPerm = listPerm + list + "]\n";
        }
        return "Perfil: " + Long.toString(getId()) + ", Descricao: " + getDescricao() + ", Permissoes: " + listPerm;
    }
    
    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setDescricao(String descrição) {
        this.descricao = descrição;
    }
    
    public final void addPermissao(String permissao){
        this.permissoes.add(permissao);
    }
    
    public final List<String> getPermissoes(){
        return this.permissoes;
    }
    
    public final void removePermissao(String permissao){
        this.permissoes.remove(permissao);
    }
}
