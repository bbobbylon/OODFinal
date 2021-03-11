package OODFinal;

public class IceCreamOrder implements CommandPattern
{
	String [] icFruits;
	String [] icSnacks;
	String [] icConfectionery;
	String customerOrder;
	Patissier p;
	public IceCreamOrder(Patissier p,String customerOrder, String[] icFruits, String[] icConfectionery, String[] icSnacks)
	{
		this.p = p;
		this.customerOrder = customerOrder;
		this.icFruits = icFruits;
		this.icConfectionery = icConfectionery;
		this.icSnacks = icSnacks;
		
	}
	@Override
	public void orderIsReady() {
		p.typeOfIceCream = customerOrder;
		p.icFruits = this.icFruits;
		p.icSnacks = this.icSnacks;
		p.icConfectionery = this.icConfectionery;
		p.getOrder("Ice Cream");
		
		
	}
	

}
