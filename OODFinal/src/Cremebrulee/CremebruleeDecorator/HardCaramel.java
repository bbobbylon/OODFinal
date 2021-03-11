package Cremebrulee.CremebruleeDecorator;
import Cremebrulee.Cremebrulee;
public class HardCaramel extends OthersDecorator{

    Cremebrulee c;
    public HardCaramel(Cremebrulee c){this.c = c;}
    @Override
    public String getDescription() {
       
        return c.getDescription() + "Hard Caramel \n";
    }

    @Override
    public double costOfCrembrule() {
  
        return 1 + c.costOfCrembrule();
    }
    
}
