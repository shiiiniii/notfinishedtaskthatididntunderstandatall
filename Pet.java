package finalwork;

public class Pet { 
	protected String name;
	protected String breed;;
	protected Boolean medic;
	protected String furColor;
	protected String birthDate;
	
	public Pet(String name, String breed, Boolean medic, String furColor, String birthDate) {
        this.name = name;
        this.breed = breed;
        this.medic = medic;
        this.furColor = furColor;
        this.birthDate = birthDate;
    
    @Override
    public String toString() {
            return String.format("%s Кличка: %s \t Порода: %s \t Прививки: %s \t Цвет шерсти: %s \t Дата рождения: %s \t", 
                                 super.toString(), name, breed, (medic) ? "да" : "нет", furColor, birthDate);
        }

        protected abstract void affection();
    }
   
        
        
        
}
