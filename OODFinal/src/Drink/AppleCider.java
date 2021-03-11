package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AppleCider extends HotDrink {
    int cost = 4;
    @Override
    public double costOfDrink() {
        
        return cost;
    }

    @Override
    public String getDescription() {
        
        return "Apple Cider";
    }

    @Override
    public void prepare() {
        
        System.out.println("Heating up the cider!");
    }

    @Override
    public void addOns() {
        
        System.out.println("Adding a hot caramel apple on the side.");
    }

    public boolean addOnOption(){
        String input = appleOption();
        if(input.equalsIgnoreCase("y")){
            cost = cost + 3;
            return true;
        } else{
            return false;
        }
    }

    private String appleOption() {
        String input = null;
        System.out.println("Would you like a hot caramel apple on the side, for an additional $3? Please enter y or n: ");
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
