/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import arquivos.Clientes;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mateus
 */
public class Cliente implements Serializable{
 
    private String nome;
    private int numeroTelefone;
    public boolean status;
    public ArrayList<String> historicoCompras = new ArrayList();

     public Cliente(String nome, int numero){
        this.nome = nome;
        this.numeroTelefone = numero;
        this.status = true;
    }

    public String getInfo(){
        return ("Nome: "+ getNome() + " Numero:" + getNumeroTelefone());
    }

    
    public boolean Comprar(Produto a, int quantidade){
        
        arquivos.Vendas v = new arquivos.Vendas();
        ArrayList <String> vendas = new ArrayList<>();
        vendas = v.getVendas();
        
        if (status){
            if (quantidade <= a.getQuantidade()){
                historicoCompras.add(nome + " comprou " + quantidade + " " + a.getNome());
                vendas.add(nome + " comprou " + quantidade + " " + a.getNome());
                v.setVendas(vendas);
                return true;
            } else {
               return false;
            }          

       }else{
           return false;
       }
    }
   
    public String getNome(){
        return nome;
    }

    public int getNumeroTelefone(){
        return numeroTelefone;
    }
    
}
