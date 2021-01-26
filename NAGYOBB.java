
package nagyobb;
import java.util.Scanner;
public class NAGYOBB {
            public static void nagyobb(int szam1, int szam2){
                if (szam1 < szam2) {
                    System.out.println("A nagyobb szám: " + szam2);
                }
                else  {
                    System.out.println("A nagyobb szám: " + szam1);
                }
            }
    public static void main(String[] args) {
    Scanner bemenet = new Scanner(System.in);
    int valasz;
        do {
        System.out.println("Add meg a 2. szám értékét:");
        nagyobb(bemenet.nextInt(), bemenet.nextInt());
        System.out.println("Szeretnéd újra futattni? i=1 n = 0");
valasz = bemenet.nextInt();
} while (valasz == 1);
    }
    
}
