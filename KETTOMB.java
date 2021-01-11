
package kettomb;

public class KETTOMB {

    public static void main(String[] args) {

        int[] tomb1 = new int[10]; //a változó deklarálása és inicializálása
        int[] tomb2 = new int[10]; //a változó deklarálása és inicializálása

        int osszeg1 = 0; //változók deklarálása és inicializálása
        int osszeg2 = 0; //változók deklarálása és inicializálása

        System.out.println("A tömb1 elemei: "); //tömb1 elemeinek kiíratása
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1; //tömb1 értékeinek megadása
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.println(tomb1[i]);
        }

        System.out.println("A tömb2 elemei: "); //tömb2 elemeinek kiíratása
        for(int i = 0; i < tomb2.length; i++)
        {
            tomb2[i] = (int) (Math.random() * 99) + 1; //tömb2 értékeinek megadása
            osszeg2 = osszeg2 + tomb2[i]; // osszeg += tomb[i]
            System.out.println(tomb2[i]);
        }

        double atlag1 = osszeg1 / (double) tomb1.length; //változók deklarálása és inicializálása
        double atlag2 = osszeg2 / (double) tomb2.length; //változók deklarálása és inicializálása
        System.out.println("\nA szamok(1) osszege: " + osszeg1); //szamok1 összegének kiíratása
        System.out.println("A számok(1) átlaga: " + atlag1);  //szamok1 átlagának kiíratása

        System.out.println("\nA szamok(2) osszege: " + osszeg2); //szamok2 összegének kiíratása
        System.out.println("A számok(2) átlaga: " + atlag2); //szamok2 átlagának kiíratása
    }
    
}
