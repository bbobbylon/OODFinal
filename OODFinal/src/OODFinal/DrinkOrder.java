package OODFinal;

public class DrinkOrder implements CommandPattern {
	Patissier p;
	String customerOrder;
	public DrinkOrder(Patissier p, String customerOrder)
	{
		this.p = p;
		this.customerOrder = customerOrder;
	}

	@Override
	public void orderIsReady() {
		p.typeOfDrink = customerOrder;
		p.getOrder("Drink");
		
	}
	

}
