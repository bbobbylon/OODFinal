package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class Oreos extends SnacksAndCandyDecorator {

    IceCream ic;
    public Oreos(IceCream ic){this.ic = ic;}
    @Override
    public String getDescription() {
        
        return ic.getDescription() + "Oreos \n";
    }

    @Override
    public double costOfIceCream() {
       
        return .5 + ic.costOfIceCream();
    }
    
}
