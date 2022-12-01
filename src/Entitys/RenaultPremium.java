package Entitys;

import AbstractClass.Thing;
import AbstractClass.Vehicle;
import Interfaces.IExploitation;

import java.util.List;

public class RenaultPremium extends Vehicle implements IExploitation {
    public RenaultPremium(int engine, int numberOfWheels, String name, double loadCapacity, double volumeCase,double v,double w){
        super(engine,numberOfWheels,name,loadCapacity,volumeCase,v,w);
    };

    @Override
    public String movementWay() {
        return "Передвигаюсь на 10 колесах";
    }

    @Override
    public String Loading(Thing thing) {
        StringBuilder response = new StringBuilder();
        List<Thing> things = this.getCarСase();
        Thing wl = workLoad();
        if(wl.getVolume()+thing.getVolume()<getVolumeCase() && wl.getWeight()+thing.getWeight()<getLoadCapacity()){
            setCarСase(thing);
            response.append("Задняя погрузка. В кузов загрушен - ");
            response.append(thing.toString());
        }else{
            response.append("Превышены максимальные параметры");
        }
        return response.toString();
    }
}
