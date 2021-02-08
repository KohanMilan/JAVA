
package csere;

public class Csere {

    public static void main(String[] args) {
        String result = CSERE ("A kutya nagyon aranyos kutya","kutya","macska");
        System.out.println("Próba! " + result);
    }
    public static String CSERE (String text , String mit , String mire) {
        text = text.replaceAll(mit, mire);
        return text;
    }
    
}
