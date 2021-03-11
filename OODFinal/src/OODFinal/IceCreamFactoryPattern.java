//part of the factory design pattern
package OODFinal;
import IceCream.*;
public class IceCreamFactoryPattern {
	public IceCream makeIceCream(String typeOfIceCream) {
		if (typeOfIceCream.equals(null))
		{
			return null;
		}
		else if (typeOfIceCream.equals("Birthday Cake Ice Cream"))
		{
			return new BirthdayCakeIceCream();
		}
		else if (typeOfIceCream.equals("Buttered Pecan Ice Cream"))
		{
			return new ButteredPecanIceCream();
		}
		else if (typeOfIceCream.equals("Chocolate Chip Cookie Dough Ice Cream"))
		{
			return new ChocolateChipCookieDoughIceCream();
		}
		else if (typeOfIceCream.equals("Chocolate Ice Cream"))
		{
			return new ChocolateIceCream();
		}
		else if (typeOfIceCream.equals("Cookies N Cream Ice Cream"))
		{
			return new CookiesNCreamIceCream();
		}
		else if (typeOfIceCream.equals("Fat Free Ice Cream"))
		{
			return new FatFreeIceCream();
		}
		else if (typeOfIceCream.equals("Gelato"))
		{
			return new Gelato();
		}
		else if (typeOfIceCream.equals("Mint Chocolate Chip Ice Cream"))
		{
			return new MintChocolateChipIceCream();
		}
		else if (typeOfIceCream.equals("Moose Tracks Ice Cream"))
		{
			return new MooseTracksIceCream();
		}
		else if (typeOfIceCream.equals("Neapolitan Ice Cream"))
		{
			return new NeapolitanIceCream();
		}
		else if (typeOfIceCream.equals("Regular Ice Cream"))
		{
			return new RegularIceCream();
		}
		else if (typeOfIceCream.equals("Sorbet"))
		{
			return new Sorbet();
		}
		else if (typeOfIceCream.equals("Strawberry Ice Cream"))
		{
			return new StrawberryIceCream();
		}
		else if (typeOfIceCream.equals("Vanilla Ice Cream"))
		{
			return new VanillaIceCream();
		}
		return null;
	}
}
