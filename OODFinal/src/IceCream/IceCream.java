package IceCream;
public abstract class IceCream {
    
    public abstract double costOfIceCream();
    
    public void scoopIceCream(String flavor){
        System.out.println("I am scooping some " + flavor + " now.");
    }
    public void serveIceCream(String flavor){
        System.out.println("Here is your " + flavor + " flavor ice cream with toppings below (if you added any):");
    }
    
    String description = "";
    public String getDescription(){
        return description;
    }

}
