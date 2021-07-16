package arquivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import negocio.Produto;

public class Produtos {

    private File arquivo;
    
    public Produtos(){
        arquivo = new File("Produtos.txt");
    }
    
    public ArrayList<negocio.Produto> getProdutos() throws FileNotFoundException, IOException{
        
            
        ArrayList<Produto> produtos = new ArrayList<>();
        FileInputStream fi = new FileInputStream(arquivo);
        ObjectInputStream input = new ObjectInputStream(fi);
        try{
            while(true){
                produtos.add((negocio.Produto) input.readObject());
            }
            
        } catch (EOFException e){
            System.out.println("Fim do arquivo (:");
        } catch (ClassNotFoundException e){
            System.out.println("Deu algo errado ):");
        }
        fi.close();
        input.close();
        return produtos;
        
    }
        public void setClientes(ArrayList<negocio.Produto> entrada) throws FileNotFoundException, IOException{

        FileOutputStream fo = new FileOutputStream(arquivo);
        ObjectOutputStream output = new ObjectOutputStream(fo);

        for(negocio.Produto c : entrada){
            output.writeObject(c);
        }
        fo.close();
        output.close();
    }
}
