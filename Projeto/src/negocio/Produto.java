/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mateus
 */
public class Produto implements Serializable{
    
    private final String nome;
    private int quantidade;
    private final String categoria;
    
    

    public Produto(String nome, String categoria, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        
    }

    public String getInfo(){
        return "Produto: " + nome + " Categoria: " + categoria + " Quantidade: " + quantidade;
    }
    
    public String getCategoria(){
        return categoria;
        
    }
    
    public String getNome() {
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }
    
    public void aumentarEstoque(int a){
        quantidade += a;
    }
    
    public boolean status(){
        if(quantidade > 0)
            return true;
        else{
            return false;
        }
    }

}
