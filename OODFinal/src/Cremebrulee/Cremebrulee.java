package Cremebrulee;

public abstract class Cremebrulee {
    public abstract double costOfCrembrule();


    public void heatUpOven(String make){
        System.out.println(make + "Heating up the oven and mixing the cream!");
    }
    public void bakeMix(String make){
        System.out.println(make + "Baking the yolk and cream mix!");
    }
    public void serveCremebrulee(String make){
        System.out.println("Here is your " + make + "Cremebrulee!");
    }

    String description = "";
    public String getDescription(){
        return description;
    }

}