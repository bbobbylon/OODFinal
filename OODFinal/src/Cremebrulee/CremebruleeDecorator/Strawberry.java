package Cremebrulee.CremebruleeDecorator;
import Cremebrulee.Cremebrulee;
public class Strawberry extends FruitDecorator {

    Cremebrulee c;
    public Strawberry(Cremebrulee c){this.c = c;}
    @Override
    public String getDescription() {
 
        return c.getDescription() + "Strawberry \n";
    }

    @Override
    public double costOfCrembrule() {
      
        return 1 + c.costOfCrembrule();
    }
    
}
