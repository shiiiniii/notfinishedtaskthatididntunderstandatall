package finalwork.Animals;
import finalwork.*;
public class Wolf {

    public String getName() {
        return "волк";
    }	
    @Override
    public String toString() {
        return String.format("%s \t %s Вожак стаи: %s \t", 
                             this.getName(), super.toString());
    }
	
	
}
