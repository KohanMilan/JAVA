
package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
       int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot 1 és 7 között!");
        answer = scanner.nextInt();
        
        while(answer > 7 || answer < 1)
        {
            System.out.println("Nem jó a szám adjon meg egy olyan számot ami 1 és 7 között van!");
            answer = scanner.nextInt();
        }
        
        switch(answer) 
        {
            case 1 : 
                System.out.println("Hétfő");
                break;
            case 2 :
                System.out.println("Kedd");
                break;
            case 3 :
                System.out.println("Szerda");
                break;
            case 4 :
                System.out.println("Csütörtök");
                break;
            case 5 :
                System.out.println("Péntek");
                break;
            case 6 :
                System.out.println("Szombat");
                break;
            case 7 :
                System.out.println("Vasárnap");
                break;
        }
    } }