package Drink;

public class Monster extends ColdDrink{

    @Override
    public String getDescription() {
      
        return "Monster ";
    }

    @Override
    public double costOfDrink() {
    
        return 3.75;
    }

}