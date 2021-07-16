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
    private String numeroTelefone;
    private boolean status;
    private ArrayList<String> carrinho = new ArrayList();

     public Cliente(String nome, String numero){
        this.nome = nome;
        this.numeroTelefone = numero;
        this.status = true;
    }

    public String getInfo(){
        return (":" + getNome() + ";" + getNumeroTelefone());
    }

    
    public boolean Comprar(Produto a, int quantidade){
       if (status){
           if (quantidade <= a.getQuantidade()){
              carrinho.add("" + a.getNome() + ";" + quantidade);
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

    public String getNumeroTelefone(){
        return numeroTelefone;
    }

    public boolean excluir(){
        if (status){
            status = false;
            return true;
        }
        return false;
        
    }
    
    public void adicionar(){
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        Clientes c = new Clientes();

        try{
            System.out.println("certo 0");
            clientes = c.getClientes();
            System.out.println("certo 1");
            clientes.add(this);
            System.out.println("certo 2");
            c.setClientes(clientes);
            System.out.println("certo 3");
        } catch (IOException ex) {
            System.out.println("ERRO");
        }
        
    }
}
