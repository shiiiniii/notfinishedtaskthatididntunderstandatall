package finalwork.Animals;
import finalwork.*;

public class Cat extends Pet{	
    public Cat(String name, String breed, Boolean medic, String furColor, String birthDate) {
        super(name, breed, medic, furColor, birthDate);

    }

    @Override
    public void sound() {
        System.out.printf("кошка(%d) мяукает\n", this.Cat());
    }
    @Override
    public void affection() {
        System.out.printf("кошка(%d) проявляет ласку\n", this.Cat());
    }
        
        
}
