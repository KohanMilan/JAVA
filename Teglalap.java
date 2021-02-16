
package teglalap.oop;

public class Teglalap {
    int a;
    int b;
    
    public void kiir(){
        System.out.print("\n\nA téglalap kerülete: " + (a+b)*2);
        System.out.print("\n\nA téglalap területe: " + a*b);
    }
    public int kerulet(){
        return (a+b)*2;
    }
    public int terulet(){
        return a*b;
    }    
}
