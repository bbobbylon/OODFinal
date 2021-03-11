package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Tea extends HotDrink {
    double cost = 1.75;
    @Override
    public double costOfDrink() {
    
        return cost;
    }

    @Override
    public String getDescription() {
      
        return "Tea ";
    }

    @Override
    public void prepare() {
      
        System.out.println("Boiling some water!");
    }

    @Override
    public void addOns() {
       
        System.out.println("Switching our filtered water with fiji water.");
    }

    public boolean addOnOption(){
        String input = fijiWaterOption();
        if(input.equalsIgnoreCase("y")){
            cost = cost + 3;
            return true;
        } else{
            return false;
        }
    }

    private String fijiWaterOption() {
        String input = null;
        System.out.println("Would you like to switch our filtered water with Fiji water, for an additional $1? Please enter y or n: ");
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
