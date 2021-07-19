package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vendas {
    
    private File arquivo;
    
    public Vendas(){
        arquivo = new File("Vendas.txt");
    }
    
    public void setVendas(ArrayList<String> entrada){
        try {
            PrintWriter output = new PrintWriter(arquivo);
            for(String s : entrada){
                output.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("N achou o arquivo de vendas ):");
        }
        
    }
    
    public ArrayList<String> getVendas(){
        
        ArrayList<String> vendas = new ArrayList<>();
        try {
            Scanner input = new Scanner(arquivo);
            
            while(input.hasNext()){
                vendas.add(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;
    }
    
}
