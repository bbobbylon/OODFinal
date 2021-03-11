package IceCream.IceCreamDecorator;

import IceCream.IceCream;
public class GummiBears extends SnacksAndCandyDecorator {

    IceCream ic;
    public GummiBears(IceCream ic){this.ic = ic;    }
    @Override
    public String getDescription() {
    
        return ic.getDescription() + "Gummi Bears \n";
    }

    @Override
    public double costOfIceCream() {

        return .75 + ic.costOfIceCream();
    }
    
}
