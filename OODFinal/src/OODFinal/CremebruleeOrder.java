package OODFinal;

public class CremebruleeOrder implements CommandPattern {
	String[] cFruit;
	String[] cOthers;
	String customerOrder;
	Patissier p;
	
	public CremebruleeOrder(Patissier p, String customerOrder, String[]cFruit, String[] cOthers)
	{
		this.p = p;
		this.customerOrder = customerOrder;
		this.cFruit = cFruit;
		this.cOthers = cOthers;
		
	}

	@Override
	public void orderIsReady() {
		p.typeOfCremebrulee = customerOrder;
		p.cFruit = this.cFruit;
		p.cOthers = this.cOthers;
		p.getOrder("Cremebrulee");
		
	}



}
