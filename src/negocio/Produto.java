/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author mateus
 */
public class Produto {
    
    private String nome;
    private int quantidade;
    private String categoria;
    
    public void setCategoria(String categoria2, ArrayList<Produto> lista){
        for (Produto p:lista){
            String convCategoria = categoria2.toUpperCase();
            if (convCategoria.equals(p.getCategoria())){
                this.categoria = convCategoria;
                
            }else {
                this.categoria = categoria2.toUpperCase();
            }
        }
    }

    public Produto(String nome, int quantidade, String categoria, ArrayList<Produto> produtosExistentes) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.setCategoria(categoria, produtosExistentes);
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

}
