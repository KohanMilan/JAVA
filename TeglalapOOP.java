
package teglalap.oop;
import java.util.Scanner;
public class TeglalapOOP {

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        Teglalap first = new Teglalap();
        
        System.out.print("Add meg az első oldal értékét: ");
        first.a = bemenet.nextInt();
        System.out.print("Add meg a második oldal értékét: ");
        first.b = bemenet.nextInt();
        
        first.kiir();
        
        System.out.print("\n\n\tBonyolultabban: ");
        System.out.println("\nKerület: " + first.kerulet());
        System.out.println("\nTerület: " + first.terulet());
    } 
}