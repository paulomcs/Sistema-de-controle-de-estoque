/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import arquivos.Clientes;
import java.util.ArrayList;
/**
 *
 * @author mateus
 */
public class Controle {
    
    public void excluir(String nome, String telefone, ArrayList<Cliente> clientes){
        for (int i = 0 ; i < clientes.size(); i++){
            if(nome.equals(clientes.get(i).getNome()) && telefone.equals(clientes.get(i).getNumeroTelefone()) ){
                clientes.remove(i);
            }
        }
    }
    
    public void adicionar(String nome, String telefone, ArrayList<Cliente> clientes){
        clientes.add(new Cliente(nome, telefone));
    }
    
}
