package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HotCocoa extends HotDrink {
    double cost = 4;
    @Override
    public double costOfDrink() {
      
        return cost;
    }

    @Override
    public String getDescription() {
       
        return "Hot Cocoa ";
    }

    @Override
    public void prepare() {
      
        System.out.println("Mixing up the ingredients!");
    }

    @Override
    public void addOns() {
       
        System.out.println("Adding whipped cream on top.");
    }

    public boolean addOnOption(){
        String input = whippedCreamOption();
        if(input.equalsIgnoreCase("y")){
            cost = cost + .75;
            return true;
        } else{
            return false;
        }
    }

    private String whippedCreamOption() {
        String input = null;
        System.out.println("Would you like to add some whipped cream on top, for an additional $.75? Please enter y or n: ");
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
