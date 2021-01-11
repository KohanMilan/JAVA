
package kiválasztás;
import java.util.Scanner;
public class Kiválasztás {

    public static void main(String[] args) {
        System.out.println("\n\tKiválasztás tétele\n");
        //Változók deklarálása
        int elemszam = (int) (Math.random()*5)+5;
        int[] szamtomb1 = new int[elemszam];
        int[] szamtomb2 = new int[elemszam];
        int[] szamtomb3 = new int[elemszam];
        //Kitöltjük a tömböket a random számok elemeivel
        for (int i = 0; i <elemszam; i++) {
            szamtomb1[i]= (int) (Math.random()*200)-100;
            szamtomb2[i]= (int) (Math.random()*200)-100;
            szamtomb3[i]= (int) (Math.random()*200)-100;
        }
        //Tömbök kiíratása
        System.out.print("Első tömb elemei:     ");
        for (int i = 0; i <elemszam; i++) {
            System.out.print(String.format("%,5d",szamtomb1[i]));
        }
        /*System.out.print("\nMásodik tömb elemei:  ");
        for (int i = 0; i <elemszam; i++) {
            System.out.print(String.format("%,5d",szamtomb2[i]));
        }
        System.out.print("\nHarmadik tömb elemei: ");
        for (int i = 0; i <elemszam; i++) {
            System.out.print(String.format("%,5d",szamtomb3[i]));
        }
        System.out.print("\nA harmadik tömb minden második eleme: ");
        for (int i = 1; i <elemszam; i+=2) {
            System.out.print(String.format("%,5d",szamtomb3[i]));
        }*/
       
        //6. A kiírt számok közül kérj be egyet a felhasználótól egy keresettElem nevű változóba, és írasd ki az indexét, azaz hanyadik elem! 
        Scanner bemenet = new Scanner(System.in);
        System.out.print("\nAdj meg egy számot a kiírt elemek közül: ");
        int keresettElem = bemenet.nextInt();
        //Kiválasztás tétele
        int i = 0;
        while (szamtomb1[i] != keresettElem) {
            i++;
        }
        System.out.println("A keresett elem indexe: "+ (i+1));
        bemenet.close();
        }
    
}
