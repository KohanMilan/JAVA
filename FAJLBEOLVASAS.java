
package fajlbeolvasas;
import java.io.*;
public class FAJLBEOLVASAS {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        
        try {
            
                raf = new RandomAccessFile("nevek.txt","r");
                
                raf.close();
            
        } catch (IOException e ) 
        {
            System.err.println("HIBA");
        }
        
    }
    
}
