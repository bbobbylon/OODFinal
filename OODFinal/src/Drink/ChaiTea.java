package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ChaiTea extends HotDrink {
    double cost = 2.5 ;
    @Override
    public double costOfDrink() {
     
        return cost;
    }

    @Override
    public String getDescription() {
       
        return "Chai Tea ";
    }

    @Override
    public void prepare() {
     
        System.out.println("Brewing your tea!");
    }

    @Override
    public void addOns() {
       
        System.out.println("Adding almond milk to the chai .");
    }

    public boolean addOnOption(){
        String input = almondMilkOption();
        if(input.equalsIgnoreCase("y")){
            cost = cost + .25;
            return true;
        } else{
            return false;
        }
    }

    private String almondMilkOption() {
        String input = null;
        System.out.println("How about almond milk instead of regular milk, for an additional $.25? Please enter y or n: ");
        BufferedReader bufferedReader =
        new BufferedReader(new InputStreamReader(System.in));
       try{
           input = bufferedReader.readLine();

       }catch (IOException e){
           e.printStackTrace();
       }

       if(input == null){
           input = "n";
       }

       return input;
    }
    
}
