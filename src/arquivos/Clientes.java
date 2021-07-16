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

//Classe que abre o arquivo que guarda os clientes no arquivo
public class Clientes{
    
    private File arquivo;
    
    public Clientes(){
        arquivo = new File("Clientes.txt");
    }
    
    public ArrayList<negocio.Cliente> getClientes() throws FileNotFoundException, IOException{
       
        ArrayList<negocio.Cliente> clientes = new ArrayList<>();
        ObjectInputStream input;
        try(FileInputStream fi = new FileInputStream(arquivo)) {
            input = new ObjectInputStream(fi);
            try{
                while(true){
                    clientes.add((negocio.Cliente) input.readObject());
                }
                
            } catch (EOFException e){
                System.out.println("Fim do arquivo (:");
            } catch (ClassNotFoundException e){
                System.out.println("Deu algo errado ):");
            }
            
        }
        input.close();
        return clientes;
    }
    
    public void setClientes(ArrayList<negocio.Cliente> entrada) throws FileNotFoundException, IOException{

        FileOutputStream fo = new FileOutputStream(arquivo);
        ObjectOutputStream output = new ObjectOutputStream(fo);

        for(negocio.Cliente c : entrada){
            output.writeObject(c);
        }
        fo.close();
        output.close();
    }
    
}
