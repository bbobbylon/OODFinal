package IceCream.IceCreamDecorator;
import IceCream.IceCream;
public class WhippedCream extends ConfectioneryDecorator {

    IceCream ic;
    public WhippedCream(IceCream ic){this.ic = ic;}
    @Override
    public String getDescription() {
       
        return ic.getDescription() + "Whipped Cream \n";
    }

    @Override
    public double costOfIceCream() {
       
        return 1 + ic.costOfIceCream();
    }
    
}
