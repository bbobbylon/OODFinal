package Drink;

public class KoolAid extends ColdDrink {

    @Override
    public String getDescription() {
       
        return "Kool Aid ";
    }

    @Override
    public double costOfDrink() {
        
        return 2;
    }
 
}
