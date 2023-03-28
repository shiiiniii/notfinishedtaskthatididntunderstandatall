package finalwork.Animals;
import finalwork.*;
public class Tiger extends Wild {
	
    public String getName() {
        return "тигр";
    }
    
    @Override
    public void sound() {
        System.out.printf("тигр(%d) рычит\n", this.Tiger());
    } 
    

}
