package Cremebrulee.CremebruleeDecorator;
import Cremebrulee.Cremebrulee;
public class VanillaBean extends OthersDecorator {

    Cremebrulee c;
    public VanillaBean(Cremebrulee c){this.c = c;}
    @Override
    public String getDescription() {

        return c.getDescription() + "Vanilla Bean \n";
    }

    @Override
    public double costOfCrembrule() {
        
        return 1 + c.costOfCrembrule();
    }
    
}
