package finalwork.Animals;
import finalwork.*;
public class Stork extends Bird{
    public String getName() {
        return "аист";
    }
    
    @Override
    public void Fly() {
        System.out.printf("аист(%d) взлетает на %.1f (м)\n", this.Stork(), super.altitude);
    }  

}
