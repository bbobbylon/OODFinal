//our server will be the invoker in the command design pattern, and it will call a method
// on the pastissiser class to do an operation
package OODFinal;
public class Server {
	CommandPattern cp;
	public void takeOrder(CommandPattern c) 
	{
		cp = c;
		cp.orderIsReady();
	}

}
