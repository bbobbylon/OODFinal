package Cremebrulee.CremebruleeDecorator;

import Cremebrulee.Cremebrulee;
public class Blueberry extends FruitDecorator {

    Cremebrulee c;
    public Blueberry(Cremebrulee c){this.c = c;}
    @Override
    public String getDescription() {
        
        return c.getDescription() + "Blueberry \n";
    }

    @Override
    public double costOfCrembrule() {
        
        return .75 + c.costOfCrembrule();
    }
    
}
