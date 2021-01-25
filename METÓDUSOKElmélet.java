
package metódusok.elmélet;
import java.util.Scanner;
public class METÓDUSOKElmélet {
static void tagolas(){
                System.out.println("\n-------------------------------------------------------------\n");
            }
            public static void korMinosites(int eletKor){
                if (eletKor < 18) {
                    System.out.println("Kiskurú");
                }
                else if (eletKor < 65) {
                    System.out.println("felnőttkorú");
                }
                else  {
                    System.out.println("Nyufdíjaskorú");
                }
            }
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);

        tagolas();
        System.out.println("Metódusok ");
        tagolas();
       int valasz ;



        do {
        System.out.println("Adj meg az életkorod, vagy más életkorát: ");
        korMinosites(bemenet.nextInt());
        System.out.println("\n\nSzeretnél új értéket megadni? (0-nem 1-igen)");
        valasz=bemenet.nextInt();
        } while (valasz == 1);
    }
    }