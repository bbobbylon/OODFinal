package Drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ColdDrink implements Drink {

    public abstract String getDescription();
    public abstract double costOfDrink();


    private void openADrink() {
        System.out.println(" :I am opening your cold drink now... :) ") ;
    }

    private void serveADrink() {
        System.out.println(" :Here is your cold drink.");
    }
    public void putIceInDrink(){
        System.out.println(" :We are putting some ice into your drink");
    }
    
    public String iceOption(){
       String input = null;
       System.out.println("Ice? Please enter y or n");
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

    public boolean yesIce(){
        String input = iceOption();
        if(input.equalsIgnoreCase("y")){
            return true;
        }
        else{
            return false;
        }
    }
        //here is where you will see the template design pattern in action
        @Override
        public void prepareADrink() {
            
            openADrink();
            if(yesIce()){
                putIceInDrink();
            }
            serveADrink();
    
       
         }


   

    
}
