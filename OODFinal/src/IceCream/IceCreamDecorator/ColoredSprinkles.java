package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class ColoredSprinkles extends ConfectioneryDecorator {

    IceCream ic;
    public ColoredSprinkles(IceCream ic){ this.ic = ic; }
    @Override
    public String getDescription() {
       
        return ic.getDescription() + "Colored Sprinkles \n";
    }

    @Override
    public double costOfIceCream() {
        
        return .75 + ic.costOfIceCream();
    }


}
