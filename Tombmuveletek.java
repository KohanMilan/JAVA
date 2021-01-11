
package tombmuveletek;
import java.util.Scanner;

public class Tombmuveletek {

    public static void main(String[] args) {
Scanner input = new Scanner (System.in);

        int[] tomb = new int[10];
        int[] tomb1 = new int[10];

        int osszeg = 0;
        int osszeg1 = 0;


        for(int i = 0; i < tomb.length; i++)
        {
            tomb[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb[i]; // osszeg += tomb[i]
            System.out.print(tomb[i] + " ");
        }

        int szam;

        //létrehozunk egy másik tömböt (ami 10 random számot generál és kiírja őket és a számok összegét kiszámítjuk )
        System.out.println("\n\nA 2. tömb elemei: ");

        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.print(tomb1[i] + " ");
        }

        System.out.print("\n\nennyi szám van a tömbbe:");

        szam = input.nextInt(   );

        System.out.println("\na tömb számai");
        System.out.println("1.: " + tomb[0] + " " + tomb1[0]);
        System.out.println("2.: " + tomb[1] + " " + tomb1[1]);
        System.out.println("3.: " + tomb[2] + " " + tomb1[2]);
        System.out.println("4.: " + tomb[3] + " " + tomb1[3]);
        System.out.println("5.: " + tomb[4] + " " + tomb1[4]);
        System.out.println("6.: " + tomb[5] + " " + tomb1[5]);
        System.out.println("7.: " + tomb[6] + " " + tomb1[6]);
        System.out.println("8.: " + tomb[7] + " " + tomb1[7]);
        System.out.println("9.: " + tomb[8] + " " + tomb1[8]);
        System.out.println("10.: " + tomb[9] + " " + tomb1[9]);
    }
    
}
