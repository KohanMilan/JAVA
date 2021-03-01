
package macskasitas;

public class Cat extends Animal implements Pet{
public Cat(){
        this.setNev("Dániel");
        this.setSuly(1);
    }
    public Cat(String nev){
        this.setNev(nev);
    }
    public Cat(String nev, int age){
        this.setNev(nev);
        this.setSuly(age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("\nMEOW");
    }

    @Override
    public void cuddle() {
    }

    @Override
    public void sit() {
    }

    @Override
    public void layDown() {
    }}