package negocio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TodosProdutos {
    
    public void cadastrarProduto(String nome, String categoria, int quantidade){
        
        ArrayList<Produto> produtos = new ArrayList<>();
        arquivos.Produtos p = new arquivos.Produtos();
        nome = nome.toLowerCase();
        categoria = categoria.toLowerCase();

        try{
            produtos = p.getProdutos();
            produtos.add(new Produto(nome, categoria, quantidade));
            p.setProdutos(produtos);
        } catch (IOException ex) {
            System.out.println("ERRO " + ex);
        }
        
    }
    
    public boolean excluirProduto(String nome){

        arquivos.Produtos p = new arquivos.Produtos();
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            produtos = p.getProdutos();
            for(Produto pr : produtos){
                if(pr.getNome() == nome){
                    produtos.remove(pr);
                    return true;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TodosProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    public ArrayList<String> getProdutosIndisponiveis(){
        ArrayList<String> produtosIndisponiveis = new ArrayList<>();
        arquivos.Produtos p = new arquivos.Produtos();
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            produtos = p.getProdutos();
            for(Produto pr : produtos){
                if(!pr.status()){
                    produtosIndisponiveis.add(pr.getInfo());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TodosProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produtosIndisponiveis;
    }
    
    public ArrayList<String> getProdutosDisponiveis(){
        ArrayList<String> produtosDisponiveis = new ArrayList<>();
        arquivos.Produtos p = new arquivos.Produtos();
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            produtos = p.getProdutos();
            for(Produto pr : produtos){
                if(pr.status()){
                    produtosDisponiveis.add(pr.getInfo());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TodosProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produtosDisponiveis;
    }
    
    private ArrayList<String> colocaNaString(ArrayList<Produto> entrada){
        ArrayList<String> saida = new ArrayList<>();
        saida.add("CATEGORIA: "+entrada.get(0).getCategoria()); 
        
        saida.add("PRODUTOS: ");
        for(Produto i : entrada){
            saida.add(i.getNome());
        }
        return saida;
    }
    
    
    
    public ArrayList<String> getProdutosOrganizados(){
        
        ArrayList<Produto> produtosMesmaCategoria = new ArrayList<>();
        arquivos.Produtos p = new arquivos.Produtos();
        ArrayList<Produto> produtos;
        ArrayList<String> saida = new ArrayList();
        
        try {
            produtos = p.getProdutos();
            for(Produto i : produtos){
                for(Produto j : produtos){
                    if(i.getCategoria().equals(j.getCategoria())){
                        produtosMesmaCategoria.add(j);
                    }
                }
                for(String s : colocaNaString(produtosMesmaCategoria)){
                    saida.add(s);
                }
                
                produtosMesmaCategoria.clear();
            }
        } catch (IOException ex) {
            Logger.getLogger(TodosProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saida;
    }
    
    public void Restoque(String nome, int quantidade){
        arquivos.Produtos p = new arquivos.Produtos();
        ArrayList<Produto> produtos = new ArrayList<>();
        
    }
    
}
