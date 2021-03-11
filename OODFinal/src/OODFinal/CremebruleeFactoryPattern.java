//part of the factory design pattern
package OODFinal;
import Cremebrulee.*;
public class CremebruleeFactoryPattern {
	public Cremebrulee makeCremebrulee(String typeOfCremebrulee) {
		if (typeOfCremebrulee.equals(null)) {
			return null;
		}
		else if (typeOfCremebrulee.equals("Vanilla"))
		{
			return new VanillaCremebrulee();
		}
		else if (typeOfCremebrulee.equals("Snickerdoodle"))
		{
			return new SnickerdoodleCremebrulee();
		}
		else if (typeOfCremebrulee.equals("Salted Caramel"))
		{
			return new SaltedCaramelCremebrulee();
		}
		
		return null;
	}

}
