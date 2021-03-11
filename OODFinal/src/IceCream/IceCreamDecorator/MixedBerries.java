package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class MixedBerries extends FruitDecorator{

    IceCream ic;
    public MixedBerries(IceCream ic){this.ic = ic;}
    @Override
    public String getDescription() {
        
        return ic.getDescription() + "Mixed Berries \n";
    }

    @Override
    public double costOfIceCream() {
        
        return .75 + ic.costOfIceCream();
    }
    
}
