
package ismetles;
import java.util.Scanner;
public class Ismetles {

    public static void main(String[] args) {
       Scanner bemenet = new Scanner (System.in);
       int valasz ;
        System.out.print("Adj meg egy pozitiv egész számot: ");
       valasz = bemenet.nextInt();
       while (valasz <0) {
           System.out.println("A megadott szám nem jó, adj meg egy pozitív egész számot:");
           valasz = bemenet.nextInt();
                   
       }
       for (int i = 0; i < valasz;i++) {
            System.out.print(i+1+" ");  
        }
        bemenet.close();
    }
    
}
