package IceCream.IceCreamDecorator;
import IceCream.IceCream;

public class Caramel extends ConfectioneryDecorator {
    IceCream ic;
    public Caramel(IceCream ic){this.ic = ic;}

    @Override
    public String getDescription() {

        return ic.getDescription() + "Caramel \n";
    }

    @Override
    public double costOfIceCream() {
  
        return .75 + ic.costOfIceCream();
    }
    
}
