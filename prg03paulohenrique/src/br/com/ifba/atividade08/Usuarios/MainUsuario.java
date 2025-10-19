/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Usuarios;


/**
 *
 * @author paulo
 */
public class MainUsuario {
    public static void main(String[] args) {
        
        //Realizando o cadastro do usuário
        Usuario user1 = new Usuario("Jhonathas", "jhonatas123@ifba.edu.br", "123456");
        
        //Inicia a Sessao, ou seja, faz o login
        Sessao sessao1 = Sessao.iniciarSessao(user1, "123456");
        
        //Cria um perfil de permissoes, já coloca uma permissao
        PerfilUsuario perfil1 = new PerfilUsuario("Adminsitrador","Gerenciar Usuarios");
        
        //Atribui um perfil a um usuario
        user1.setPerfil(perfil1);
        
        
        //mostrar como ficou no console
        System.out.println(user1.toString());
        System.out.println(sessao1.toString());
        System.out.println(perfil1.toString());
    }
}
