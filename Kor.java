
package kor;
import java.util.Scanner;
public class Kor {

    public static void main(String[] args) {
                Scanner bemenet = new Scanner(System.in);
        KeruletTerulet first = new KeruletTerulet();
        System.out.print("Adj meg egy számot(kör sugara): ");
        int r = bemenet.nextInt();
        first.kerulet (r , first.pi);
        
        first.terulet(r , first.pi);
    }
    
}