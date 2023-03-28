package finalwork;

public abstract class Wild extends Animals {
    protected String habitat;
    protected String date;

    public Wild(String habitat, String date) {
        
        this.habitat = habitat;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s Место обитания: %s \t Дата нахождения: %s \t", 
                             super.toString(), habitat, date);
    }

}
