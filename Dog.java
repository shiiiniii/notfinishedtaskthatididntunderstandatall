package finalwork.Animals;
import finalwork.*;
public class Dog extends Pet{
	private boolean training;
	public Dog(String name, String breed, Boolean medic, String furColor, String birthDate) {
        super(name, breed, medic, furColor, birthDate);
        this.training = training;

    }
	
    public String getName() {
        
        return "собака";	
    }
    public boolean training() {
        return training;
    }	
    @Override
    public void affection() {
        System.out.printf("собака(%d) проявляет ласку\n", this.Dog());
    }
    
    
}
