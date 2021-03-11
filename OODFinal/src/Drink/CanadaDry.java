package Drink;

public class CanadaDry extends ColdDrink{

    @Override
    public String getDescription() {
        
        return "Canada Dry ";
    }

    @Override
    public double costOfDrink() {
       
        return 1;
    }

}