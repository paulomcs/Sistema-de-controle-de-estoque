package negocio;

import arquivos.Clientes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TodosClientes {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public int encontrarPosCliente(int numero){
        arquivos.Clientes c = new arquivos.Clientes();
        try {
            clientes = c.getClientes();
        } catch (IOException ex) {
            Logger.getLogger(TodosClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNumeroTelefone() == numero)
                return i;
        }
        return -1;
    }
    
    public boolean excluirCliente(int numero) throws IOException{
        arquivos.Clientes c = new arquivos.Clientes();
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes = c.getClientes();
        int pos = encontrarPosCliente(numero);
        if(pos == -1)
            return false;
        clientes.remove(pos);
        c.setClientes(clientes);
        return true;
    }
    
    public void adicionar(String nome, int numero){
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        Clientes c = new Clientes();

        try{
            clientes = c.getClientes();
            clientes.add(new Cliente(nome, numero));
            c.setClientes(clientes);
        } catch (IOException ex) {
            System.out.println("ERRO");
        }
        
    }
    
    public boolean realizarCompra(int numero, Produto produto, int quant){
        arquivos.Clientes c = new arquivos.Clientes();
        arquivos.Produtos p = new arquivos.Produtos();
        
        ArrayList<arquivos.Produtos> produtos = new ArrayList<>();
        
        try {
            c.getClientes().get(encontrarPosCliente(numero)).Comprar(produto, quant);
            return true;
        } catch (IOException ex) {
            return false;
        }
        
        
    }
    
    public ArrayList clientesTodos(){
        ArrayList<String>saida = new ArrayList<>();
        arquivos.Clientes c = new arquivos.Clientes();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for(Cliente cl : clientes){
            saida.add(cl.getInfo());
        }
        return saida;
    }
    
    public ArrayList<String> clientesAtivos(){
        ArrayList<String>saida = new ArrayList<>();
        arquivos.Clientes c = new arquivos.Clientes();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for(Cliente cl : clientes){
            if(cl.status)
                saida.add(cl.getInfo());
        }
        return saida;
    }
    
}
