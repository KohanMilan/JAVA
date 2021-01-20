
package menu;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        int elemszam =20;
        int[] szamok = new int [elemszam];
        int valasz;
        for (int i = 0; i < elemszam; i++) 
            szamok[i] = (int) (Math.random()*100)-50;
        for (int i = 0; i < elemszam; i++) 
            System.out.print(szamok[i]+",  ");
        
        System.out.println("Adj meg egy számot (1-5) annak függvényében, hogy: \n  "+ 
"     1 - összeget számoltatni: tömbök összegét kiíratni\n" +
"     2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni\n" +
"     3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?\n" +
"     4 - 5-tel osztható páros számok db-száma: mennyi?\n" +
"     5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.");
        valasz = bemenet.nextInt();
        while (!(valasz > 0 && valasz <= 5)) {            
            System.out.print("rossz számot adtál meg, adj meg egy számot 1 és 5 között: ");
            valasz = bemenet.nextInt();
        }
        //1es feladat
        switch (valasz) {
            case 1:
                int f1 = 0;
                for (int i = 0; i < elemszam; i++)
                    f1 = f1 + szamok[i];
                System.out.println("A tömb összege: "+ f1 );
                break;
            case 2:
                int f2 = 51;
                int f22 = -51;
                for (int i = 0; i < elemszam; i++) {
                    if (!(f2 < szamok[i]))
                        f2 = szamok[i];
                    if (!(f22 > szamok[i]))
                        f22 = szamok[i];
                }   System.out.println("A legkisebb szám: " + f2 + "\nA legnagyobb szám: " + f22);
                break;
            case 3:
                boolean f3 = false;
                for (int i = 0; i < elemszam; i++) {
                    if (szamok[i]>40&&szamok[i]<50)
                        f3 = true;
                }       if (f3==false) 
                    System.out.println("nincs 40-50 szám a tömbbe ");
                else
                    System.out.println("van 40-50 szám a tömbbe ");
                break;
            case 4:
                int f4 = 0;
                for (int i = 0; i < elemszam; i++) {
                    if (szamok[i]%10==0) {
                        f4 ++;
                    }
                }   System.out.println("A 10el osztható számok száma: "+f4);
                break;
            case 5:
                int keresettSzam;
                int index = 0;
                System.out.print("Adj meg egy számot a tömbből: ");
                keresettSzam = bemenet.nextInt();
                boolean valasz2;
                do {
                    System.out.print("Nem jó számot adtám meg, adj meg egy sszámot a tömbből: ");
                    keresettSzam = bemenet.nextInt();
                    valasz2 = false;
                    for (int i = 0; i < elemszam; i++) {
                        if (szamok[i] == keresettSzam) {
                            valasz2 = true;
                            index = i+1;
                            break;
                        }
                    }
                } while (valasz2 == false);
                System.out.println("Tartalmazza, a keresett elem indexe: " + index);
                break;
            default:
                break;
        }
    }
}