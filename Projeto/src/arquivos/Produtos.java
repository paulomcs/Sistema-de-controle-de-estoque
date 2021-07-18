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
        
            
        ArrayList<negocio.Produto> produtos = new ArrayList<>();
        FileInputStream fi = new FileInputStream(arquivo);
        ObjectInputStream input;
        
        try{
            input = new ObjectInputStream(fi);
            while(true){
                try{
                    produtos.add((negocio.Produto) input.readObject());
                }
                 catch (EOFException e){
                    input.close();
                    throw new Error("cabo o arquivo");
                }
            }
            
        }  catch (EOFException e){
            System.out.println("arquivo vazio");
            return new ArrayList<>();
        }catch (ClassNotFoundException e){
            System.out.println("Deu algo errado ):");
        } catch (Error e){
            System.out.println(e.getMessage());
        }
        
        fi.close();
        return produtos;
        
    }
        public void setProdutos(ArrayList<negocio.Produto> entrada) throws FileNotFoundException, IOException{

        FileOutputStream fo = new FileOutputStream(arquivo);
        ObjectOutputStream output = new ObjectOutputStream(fo);

        for(negocio.Produto c : entrada){
            output.writeObject(c);
        }
        fo.close();
        output.close();
    }
}
