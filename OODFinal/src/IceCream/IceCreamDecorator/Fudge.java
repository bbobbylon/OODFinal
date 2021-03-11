package IceCream.IceCreamDecorator;

import IceCream.IceCream;
public class Fudge extends ConfectioneryDecorator {

    IceCream ic;
    public Fudge(IceCream ic){this.ic = ic;}
    @Override
    public String getDescription() {
      
        return ic.getDescription() + "Fudge \n";
    }

    @Override
    public double costOfIceCream() {
       
        return 1.25 + ic.costOfIceCream();
    }
    
}
