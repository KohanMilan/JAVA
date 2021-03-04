package szk.pkg2020.pkg03.pkg04;

public class nyirszikszi10a {
     private String nev;
     private int szuletett;
     
     public nyirszikszi10a(String nev, int szuletett) {
         setNev(nev);
         setSzuletett(szuletett);
         nagykoruE(this.getSzuletett());
     }

    public String getNev() {
        return this.nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzuletett() {
        return this.szuletett;
    }

    public void setSzuletett(int szuletett) {
        this.szuletett = szuletett;
    }
    
    private void nagykoruE(int szuletett) {
        int kor = 2021 - szuletett;
        System.out.println(2021 - szuletett >= 18 ?
                this.getNev() + " nagykorú, mert " + this.getSzuletett() + ". évben született, " + kor + " éves most." : 
                this.getNev() + " még nem nagykorú, mert " + this.getSzuletett() + ". évben született, " + kor+ " éves most.");
    }
     
}