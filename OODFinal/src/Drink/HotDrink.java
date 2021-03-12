package Drink;

public abstract class HotDrink implements Drink {
    public abstract double costOfDrink();
    public abstract String getDescription();
    public abstract void prepare();
    public abstract void addOns();

    boolean addOnOption(){
        return true;
    }

    // here is the template method
    @Override
    public void prepareADrink(){
        boilWater();
        prepare();
        serveADrink();

        if (addOnOption()){
            addOns();
        }
    }

    private void serveADrink() {
        System.out.println(" :Serving your drink...");
    }

    private void boilWater() {
        System.out.println(" :Boiling some water...");
    }
    
}
