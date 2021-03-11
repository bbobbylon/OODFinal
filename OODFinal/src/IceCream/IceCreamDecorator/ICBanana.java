package IceCream.IceCreamDecorator;

import IceCream.IceCream;

public class ICBanana extends FruitDecorator {
    IceCream ic;

    public ICBanana(IceCream ic){ this.ic = ic;}
    @Override
    public double costOfIceCream() {
        return .75 + ic.costOfIceCream();
    }

    @Override
    public String getDescription() {
      
        return ic.getDescription() + "Banana \n";
    }
    
}
