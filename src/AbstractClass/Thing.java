package AbstractClass;

public abstract class Thing {
    private double volume;
    private double weight;

    private String name;

    public Thing(String name,double volume, double weight) {
        this.name = name;
        this.volume = volume;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "объем = " + volume +
                ", вес = " + weight +
                ", название = '" + name + '\'' +
                '}';
    }
}
