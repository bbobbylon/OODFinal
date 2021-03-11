package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HotChocolate extends HotDrink {
    double cost = 3;
    @Override
    public double costOfDrink() {
        
        return cost;
    }

    @Override
    public String getDescription() {
     
        return "Hot Chocolate ";
    }

    @Override
    public void prepare() {
      
        System.out.println("Melting the chocolate!");
    }

    @Override
    public void addOns() {
        
        System.out.println("Adding EXTRA marshmellows!");
    }

    public boolean addOnOption(){
        String input = marshmellowOption();
        if(input.equalsIgnoreCase("y")){
            cost = cost + .25;
            return true;
        } else{
            return false;
        }
    }

    private String marshmellowOption() {
        String input = null;
        System.out.println("We can add extra marshmellows, for an additional $.25. Please enter y or n: ");
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
