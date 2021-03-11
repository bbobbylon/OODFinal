package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class ReesesCups extends SnacksAndCandyDecorator{

    IceCream ic;
    public ReesesCups(IceCream ic)
    {this.ic = ic;}
    @Override
    public String getDescription() {
    
        return ic.getDescription() + "Reeses Cups \n";
    }

    @Override
    public double costOfIceCream() {
     
        return .75 + ic.costOfIceCream();
    }

}