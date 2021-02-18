
package szemelyekoop;

public class SzemelyekOOP {

    public static void main(String[] args) {
        Szemelyek Milan = new Szemelyek();
        
        Milan.eletkor = 17;
        Milan.hajszin = "Barna";
        Milan.hazasE = false;
        Milan.iq = 1000;
        Milan.magassag = 187;
        Milan.nem = "férfi";
        Milan.testsuly = 95;
        
        Tanulok Elemer = new Tanulok();
        
        Elemer.eletkor = 20;
        Elemer.nem = "férfi";
        Elemer.osztondijasE = true;
        
        Tanarok Béla = new Tanarok();
        
        Béla.eletkor = 45;
        Béla.szak = "Matek";
        
        System.out.println(Milan.eletkor);
        System.out.println(Elemer.osztondijasE);
        System.out.println(Béla.szak);
    }
    
}
