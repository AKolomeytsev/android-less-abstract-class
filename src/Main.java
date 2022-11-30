import AbstractClass.Thing;
import Entitys.RenaultPremium;
import Entitys.ReturnThing;

public class Main {
    public static void main(String[] args) {
        RenaultPremium renaultPremium = new RenaultPremium(420, 10, "Renault Premeum", 20, 82,150,10);
        System.out.println(renaultPremium.toString());
        System.out.println(renaultPremium.toStringCarCase());
        Thing thing1 = new ReturnThing("Арбуз",10,5) ;
        Thing thing2 = new ReturnThing("Огурец",15,8) ;
        Thing thing3 = new ReturnThing("Помидор",15,6) ;
        Thing thing4 = new ReturnThing("Банан",15,6) ;
        System.out.println(renaultPremium.Loading(thing1));
        System.out.println(renaultPremium.Loading(thing2));
        System.out.println(renaultPremium.Loading(thing3));
        System.out.println(renaultPremium.Loading(thing4));
        System.out.println(renaultPremium.toStringCarCase());
    }
}
