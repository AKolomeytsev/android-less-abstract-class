package AbstractClass;

import Entitys.ReturnThing;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle extends Thing {
    private int engine;
    private int numberOfWheels;
    private List<Thing> carСase = new ArrayList<>();
    private double loadCapacity;
    private double volumeCase;

    public Vehicle(int engine, int numberOfWheels, String name, double loadCapacity, double volumeCase,double v,double w) {
        super(name,v,w);
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
        this.loadCapacity = loadCapacity;
        this.volumeCase = volumeCase;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public List<Thing> getCarСase() {
        return carСase;
    }

    public void setCarСase(Thing thing ) {
        this.carСase.add(thing);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getVolumeCase() {
        return volumeCase;
    }

    public void setVolumeCase(double volumeCase) {
        this.volumeCase = volumeCase;
    }

    public Thing workLoad(){
        double w = 0;
        double v = 0;
        String n = "Количество груза";
        Thing thing = new ReturnThing(n,v,w);
        if(carСase != null) {
            for (Thing item : carСase) {
                w += item.getWeight();
                v += item.getVolume();
            }
        }else {
            return thing;
        }
        thing.setVolume(v);
        thing.setWeight(w);
        return thing;
    }

    public String toStringCarCase() {
        StringBuilder caseLoad = new StringBuilder();
        if(carСase.size() != 0) {
            caseLoad.append("В кузове:");
            caseLoad.append("\n");
            for (Thing item : carСase) {
                caseLoad.append(item.toString());
                caseLoad.append("\n");
            }
        }else {
            caseLoad.append("Кузов пуст");
            caseLoad.append("\n");
        }
        return caseLoad.toString();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Название авто = " + getName() +
                ", Мощьность двигателя = " + getEngine() +
                ", Количество колес = " + getNumberOfWheels() +
                ", Грузоподъемность = " + getLoadCapacity() +
                ", Объем кузова = " + getVolumeCase() +
                '}';
    }
}
