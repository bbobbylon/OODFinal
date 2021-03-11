package Cremebrulee.CremebruleeDecorator;

import Cremebrulee.Cremebrulee;
public class Banana  extends FruitDecorator{

    Cremebrulee c;
    public Banana(Cremebrulee c){this.c = c;}
    @Override
    public String getDescription() {
        
        return c.getDescription() + "Banana \n";
    }

    @Override
    public double costOfCrembrule() {
        
        return .5 + c.costOfCrembrule();
    }
    
}
