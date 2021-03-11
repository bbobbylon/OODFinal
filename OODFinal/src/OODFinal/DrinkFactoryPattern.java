//part of the factory design pattern
package OODFinal;
import Drink.*;

public class DrinkFactoryPattern {
	
	//verify what the user picks in a loop
	public Drink makeDrink(String typeOfDrink) {
		if (typeOfDrink.equals(null))
		{
			return null;
		}
		else if (typeOfDrink.equals("Apple Cider"))
		{
			return new AppleCider();
		}
		else if (typeOfDrink.equals("Aquafina"))
		{
			return new Aquafina();
		}
		else if (typeOfDrink.equals("CanadaDry"))
		{
			return new CanadaDry();
		}
		else if (typeOfDrink.equals("Chai Tea"))
		{
			return new ChaiTea();
		}
		else if (typeOfDrink.equals("Fiji Water!"))
		{
			return new FijiWater();
		}
		else if (typeOfDrink.equals("Fruit Punch."))
		{
			return new FruitPunch();
		}
		else if (typeOfDrink.equals("Gatorade."))
		{
			return new Gatorade();
		}
		else if (typeOfDrink.equals("Coca Cola!"))
		{
			return new GoodOlCocaCola();
		}
		else if (typeOfDrink.equals("Hawaiian Punch."))
		{
			return new HawaiianPunch();
		}
		else if (typeOfDrink.equals("Hot Chocolate"))
		{
			return new HotChocolate();
		}
		else if (typeOfDrink.equals("Hot Cocoa"))
		{
			return new HotChocolate();
		}
		else if (typeOfDrink.equals("Kool Aid"))
		{
			return new KoolAid();
		}
		else if (typeOfDrink.equals("Monster"))
		{
			return new Monster();
		}
		else if (typeOfDrink.equals("Pepsi"))
		{
			return new Pepsi();
		}
		else if (typeOfDrink.equals("Powerade"))
		{
			return new Powerade();
		}
		else if (typeOfDrink.equals("Root Beer"))
		{
			return new RootBeer();
		}
		else if (typeOfDrink.equals("Sierra Mist"))
		{
			return new SierraMist();
		}
		else if (typeOfDrink.equals("Sprite"))
		{
			return new Sprite();
		}
		else if (typeOfDrink.equals("Tea"))
		{
			return new Tea();
		}
		
		
		return null;
	}

}
