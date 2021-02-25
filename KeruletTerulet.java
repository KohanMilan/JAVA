
package kor;

public class KeruletTerulet {
double pi = 3.14;
    public void kerulet (int r, double pi){
        pi = this.pi;
        System.out.println("A kör kerülete: " + 2*r*pi);
    }
    
    public void terulet (int r, double pi){
        pi = this.pi;
        System.out.println("A kör területe: " + r*r*pi);
    }
}
