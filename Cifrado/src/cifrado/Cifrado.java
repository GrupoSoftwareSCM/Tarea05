/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oscar
 */
public class Cifrado {

    /**
     * @param args the command line arguments
     */
    
   
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File ayuda = new File ("/home/oscar/Escritorio/Software/TAREA05/Tarea05/pista.txt");
        FileReader af = new FileReader (ayuda);
        BufferedReader abr = new BufferedReader(af);
        
        String pista = abr.readLine();
        System.out.println(pista);
        /*for (String retval: pista.split("#0", 1000)){
         System.out.println(retval);
        }*/
       
        
        
        
        
       
        File archivo = new File ("/home/oscar/Escritorio/Software/TAREA05/Tarea05/cifrado.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        String cifrado = br.readLine();
        System.out.println(cifrado);
        /*
        | vamos a probar con 3 carriles
        */
       
        /*
        //System.out.println(linea);
        int l = linea.length()/3;
        //System.out.println(linea.length());
        String sub1 = linea.substring(0, l);
        System.out.println(sub1);
        String sub2 = linea.substring(l, l*2);
        System.out.println(sub2);
        String sub3 = linea.substring(l*2, linea.length());
        System.out.println(sub3);
        */
        
        
        
    }
    
}
