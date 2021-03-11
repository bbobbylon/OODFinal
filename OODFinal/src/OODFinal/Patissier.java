//our pastry expert is the receiver of the command design pattern
//methods are called from the server to perform an operation
package OODFinal;
import Cremebrulee.Cremebrulee;
import Cremebrulee.CremebruleeDecorator.Banana;
import Cremebrulee.CremebruleeDecorator.Blueberry;
import Cremebrulee.CremebruleeDecorator.HardCaramel;
import Cremebrulee.CremebruleeDecorator.Strawberry;
import Cremebrulee.CremebruleeDecorator.VanillaBean;
import Drink.Drink;
import IceCream.IceCream;
import IceCream.IceCreamDecorator.Caramel;
import IceCream.IceCreamDecorator.CoconutShavings;
import IceCream.IceCreamDecorator.ColoredSprinkles;
import IceCream.IceCreamDecorator.CookieDough;
import IceCream.IceCreamDecorator.Fudge;
import IceCream.IceCreamDecorator.GummiBears;
import IceCream.IceCreamDecorator.MixedBerries;
import IceCream.IceCreamDecorator.Oreos;
import IceCream.IceCreamDecorator.ReesesCups;
import IceCream.IceCreamDecorator.WhippedCream;
import IceCream.IceCreamDecorator.ICBanana;

public class Patissier {
	IceCream ic;
	Drink drink;
	Cremebrulee cremebrulee;
	
	public static String typeOfIceCream = "";
	public static String typeOfDrink = "";
	public static String typeOfCremebrulee = "";
	
	public static String[] cFruit = null;
	public static String[] cOthers = null;
	
	public static String[] icFruits = null;
	public static String[] icConfectionery = null;
	public static String[] icSnacks = null;
	
	
	
	public void getOrder(String typeOfFactory)
	{
		if (typeOfFactory.equalsIgnoreCase("Ice Cream"))
		{
			System.out.println(typeOfIceCream + " order has been received");
			System.out.println();
			IceCreamFactoryPattern icFactoryPattern = new IceCreamFactoryPattern();
			ic = icFactoryPattern.makeIceCream(typeOfIceCream);
			ic.scoopIceCream(typeOfIceCream);
			ic.serveIceCream(typeOfIceCream);
			ic = decorateIceCream(icConfectionery, icFruits, icSnacks);
			System.out.println(ic.getDescription() + " your ice cream order is finished, totaling: $ " + ic.costOfIceCream());
			System.out.println();
		}
		else if(typeOfFactory.equalsIgnoreCase("Cremebrulee"))
		{
			System.out.println(typeOfCremebrulee + " order has been received.");
			System.out.println();
			CremebruleeFactoryPattern cremebruleeFactoryPattern = new CremebruleeFactoryPattern();
			cremebrulee = cremebruleeFactoryPattern.makeCremebrulee(typeOfCremebrulee);
			cremebrulee.heatUpOven(typeOfCremebrulee);
			cremebrulee.bakeMix(typeOfCremebrulee);
			cremebrulee.serveCremebrulee(typeOfCremebrulee);
			cremebrulee = decorateCremebrulee(cOthers, cFruit);
			System.out.println(cremebrulee.getDescription() + " your crembrule order is finished");
			System.out.println();
			System.out.println("Cost of your cremebrulee: $" + cremebrulee.costOfCrembrule());
		}
	
		else if (typeOfFactory.equalsIgnoreCase("Drink"))
		{
			System.out.println(typeOfDrink + " order has been received");
			DrinkFactoryPattern dFactoryPattern = new DrinkFactoryPattern();
			drink = dFactoryPattern.makeDrink(typeOfDrink);
			drink.prepareADrink();
			System.out.println(drink.getDescription() + " drink order has finished\n");
			System.out.println("Totaling: " + drink.costOfDrink());
			System.out.println("\n");
		}
	}
	//our cremebrulee decorate method
	public Cremebrulee decorateCremebrulee(String[] cOthers, String[] cFruit)
	{
		for (int i = 0; i < cOthers.length; i++)
		{
			String others = cOthers[i];
			if(others.equals("Hard Caramel"))
			{
				cremebrulee = new HardCaramel(cremebrulee);
			}
			else if (others.equals("Vanilla Bean"))
			{
				cremebrulee = new VanillaBean(cremebrulee);
			}
		}
		for (int i = 0; i< cFruit.length; i ++)
		{
			String fruits = cFruit[i];
			if (fruits.equals("Banana"))
			{
				cremebrulee = new Banana(cremebrulee);
			}
			else if (fruits.equals("Blueberry"))
			{
				cremebrulee = new Blueberry(cremebrulee);
			}
			else if (fruits.equals("Strawberry"))
			{
				cremebrulee = new Strawberry(cremebrulee);
			}
				
		}
		return cremebrulee;
	}
	
	
	public IceCream decorateIceCream(String[] icConfectionery, String[] icFruits, String[] icSnacks)
	
	{
		for (int i =0; i<icConfectionery.length; i++)
		{
			String confectioneries = icConfectionery[i];
			if (confectioneries.equals("Caramel"))
			{
				ic = new Caramel(ic);
			}
			else if (confectioneries.equals("Coconut Shavings"))
			{
				ic = new CoconutShavings(ic);
			}
			else if (confectioneries.equals("Colored Sprinkles"))
			{
				ic = new ColoredSprinkles(ic);
			}
			else if (confectioneries.equals("Fudge"))
			{
				ic = new Fudge(ic);
			}
			else if (confectioneries.equals("Whipped Cream"))
			{
				ic = new WhippedCream(ic);
			}
		}
		for (int i =0; i< icFruits.length; i++)
		{
			String fruits = icFruits[i];
			if(fruits.equals("Banana"))
			{
				ic = new ICBanana(ic);
			}
			else if (fruits.equals("Mixed Berries"))
			{
				ic = new MixedBerries(ic);
			}
		}
		for (int i = 0; i < icSnacks.length; i++)
		{
			String snacks = icSnacks[i];
			if (snacks.equals("Cookie Dough"))
			{
				ic = new CookieDough(ic);
			}
			else if (snacks.equals("Gummi Bears"))
			{
				ic = new GummiBears(ic);
			}
			else if (snacks.equals("Oreos"))
			{
				ic = new Oreos(ic);
			}
			else if (snacks.equals("Reeses Cups"))
			{
				ic = new ReesesCups(ic);
			}
				
		}
		return ic;
	}


}
