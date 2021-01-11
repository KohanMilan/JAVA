
package eldontes.tetele;
import java.util.Scanner;
public class EldontesTetele {

    public static void main(String[] args) {
Scanner input = new Scanner (System.in); //Scanner behívása

        int elemSzam;
        System.out.print("Adj meg egy számot");
        elemSzam = input.nextInt();
        int[] szamok = new int  [elemSzam];


        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*40)-20;   //-20 és + 20 között
            System.out.print(szamok[i]+"  ");

        }

        for (int i = 0; i < elemSzam; i++) {
            if(szamok[i]==0){
                System.out.println("\n\nA számsor tartalmaz 0-át\n");
            }
        }
    }
}