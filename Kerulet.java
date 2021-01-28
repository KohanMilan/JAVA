
package kerulet;
import java.util.Scanner;
public class Kerulet {
private static double keruletTlap (double a, double b)
{
    return a + b * 2;
}
private static double keruletKor (double r)
{
    return 2* r * Math.PI;
}
private static double keruletHszog (double a, double b, double c)
{
    return a + b+ c;
}
private static double keruletNszog (double a, double b, double c)
{
    return 4 * a;
}
private static double keruletHatszog (double a)
{
    return 6 * a;
}
    public static void main(String[] args) {
    Scanner bemenet = new Scanner(System.in);
    int valasz;
    System.out.print("\n1 = téglalap \n2 = kör \n3 = háromszög \n4 = négyszög \n5 = hatszög \nMelyik alakzatot akarod kiszámoltatni? ");
    valasz = bemenet.nextInt();
    int valasz2;
    
    do {
     
    switch(valasz) {
        case 1:
            System.out.printf("Téglalap kerülete: %.2f\n" , keruletTlap(12, 35));
            break;
        case 2:
            System.out.printf("Kör erulete: %.2f\n" , keruletKor(25));
            break;
        case 3:
            System.out.printf("Háromszög kerulete: %.2f\n" , keruletHszog(30,30,10));
            break;
        case 4:
            System.out.printf("Négyszög kerulete: %.2f\n" , keruletNszog(30,30,10));
            break;
        case 5:
            System.out.printf("Hatszög kerulete: %.2f\n" , keruletHatszog(15));
            break;
    }
        System.out.println("Szeretnéd újra futtatni?(igen=0 nem=1)");
        valasz2 = bemenet.nextInt();
    }while (valasz2 == 0);
    }
    
}
