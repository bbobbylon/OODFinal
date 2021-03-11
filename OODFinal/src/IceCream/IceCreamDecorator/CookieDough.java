package IceCream.IceCreamDecorator;

import IceCream.IceCream;
public class CookieDough extends SnacksAndCandyDecorator{


    IceCream ic;
    public CookieDough(IceCream ic){this.ic = ic;}
    @Override
    public String getDescription() {
      
        return ic.getDescription() + "Cookie Dough \n";
    }

    @Override
    public double costOfIceCream() {
        
        return 1.25 + ic.costOfIceCream();
    }

    
}
