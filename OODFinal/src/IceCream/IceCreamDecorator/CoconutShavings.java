package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class CoconutShavings extends ConfectioneryDecorator {

    IceCream ic;
    public CoconutShavings(IceCream ic){this.ic = ic; }
    @Override
    public String getDescription() {
      
        return ic.getDescription() + "Coconut Shavings \n";
    }

    @Override
    public double costOfIceCream() {
       
        return 1 + ic.costOfIceCream();
    }

    
}
