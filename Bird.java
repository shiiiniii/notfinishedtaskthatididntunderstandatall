package finalwork;

public abstract class Bird extends Animal{
    protected Double altitude;

    @Override
    public String toString() {
        return String.format("%s Высота полёта: %.1f \t", 
                             super.toString(), altitude);
    }

    protected abstract void Fly();
}
