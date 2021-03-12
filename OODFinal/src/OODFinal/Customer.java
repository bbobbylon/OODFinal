package OODFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer 
{
	static String typeOfDrink = "";
	public static void main (String[] args) 
	{
		Patissier p = new Patissier();
		Server s = new Server();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("Welcome to cozyDesserts! \n" 
					+ "How can we help you today? Please see the menu below: \n"
					+ "1. Ice Cream order \n"
					+ "2. Cremebrulee order \n"
					+ "3. Drink order \n"
					+ "0. Please complete my order.");
			System.out.println();
			
			int a = sc.nextInt();
			if (a == 1)
			{
				String typeOfIceCream = null;
				String in = null;
				ArrayList<String> confectioneryList = new ArrayList<>();
				ArrayList<String> snacksAndCandyList = new ArrayList<>();
				ArrayList<String> fruitList = new ArrayList<>();
				
				while(true)
				{
					System.out.println("What kind of ice cream would you like? \n"
							+ "Unless noted, price for ice cream is $2.50 \n"
							+ "B(i)rthday Cake \n"
							+ "B(u)ttered Pecan \n"
							+ "(C)hocolate Chip Cookie Dough \n"
							+ "C(h)ocolate Chip \n"
							+ "C(o)okies N Cream \n"
							+ "(F)at Free \n"
							+ "(G)elato : $3.25 \n"
							+ "(M)int Chocolate Chip \n"
							+ "Moose (T)racks \n"
							+ "(N)eapolitan \n"
							+ "(R)egular Ice Cream : $1.5 \n"
							+ "(S)orbet : $2.00 \n"
							+ "Stra(w)berry \n"
							+ "(V)anilla");
					System.out.println();
					BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
					try 
					{
						in = input.readLine();
					}catch (IOException ioe)
					{
						ioe.printStackTrace();
					}
					if (in.equals("i") || in.equals("I"))
					{
						typeOfIceCream = "Birthday Cake Ice Cream";
						System.out.println("You selected Birthday cake!");
						System.out.println();
						break;
					}
					else if (in.equals("u") || in.equals("U"))
					{
						typeOfIceCream = "Buttered Pecan Ice Cream";
						System.out.println("You selected Buttered Pecan Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("C") || in.equals("c"))
					{
						typeOfIceCream = "Chocolate Chip Cookie Dough Ice Cream";
						System.out.println("You selected Chocolate Chip Cookie Dough Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("h") || in.equals("H"))
					{
						typeOfIceCream = "Chocolate Chip Ice Cream";
						System.out.println("You selected Chocolate Chip Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("o") || in.equals("O"))
					{
						typeOfIceCream = "Cookies N Cream Ice Cream";
						System.out.println("You selected Cookies N Cream Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("F") || in.equals("f"))
					{
						typeOfIceCream = "Fat Free Ice Cream";
						System.out.println("You selected Fat Free Ice Cream Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("G") || in.equals("g"))
					{
						typeOfIceCream = "Gelato";
						System.out.println("You selected Gelato.");
						System.out.println();
						break;
					}
					else if (in.equals("M") || in.equals("m"))
					{
						typeOfIceCream = "Mint Chocolate Chip Ice Cream";
						System.out.println("You selected Mint Chocolate Chip");
						System.out.println();
						break;
					}
					else if (in.equals("T") || in.equals("t"))
					{
						typeOfIceCream = "Moose Tracks Ice Cream";
						System.out.println("You selected Moose Tracks Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("N") || in.equals("n"))
					{
						typeOfIceCream = "Neapolitan Ice Cream";
						System.out.println("You selected Neapolitan Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("R") || in.equals("r"))
					{
						typeOfIceCream = "Regular Ice Cream";
						System.out.println("You selected Regular Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("S") || in.equals("s"))
					{
						typeOfIceCream = "Sorbet";
						System.out.println("You selected Sorbet");
						System.out.println();
						break;
					}
					else if (in.equals("w")|| in.equals("W"))
					{
						typeOfIceCream = "Strawberry Ice Cream";
						System.out.println("You selected Strawberry Ice Cream");
						System.out.println();
						break;
					}
					else if (in.equals("V") || in.equals("v"))
					{
						typeOfIceCream = "Vanilla Ice Cream";
						System.out.println("You selected Vanilla Ice Cream");
						System.out.println();
						break;
					}
					else 
					{
						continue;
					}	
					
				}
				
				//fruit toppings menu
				System.out.println("******************************");
				System.out.println("Let's get into some fruit toppings for your ice cream...");
				System.out.println();
				Scanner fruitScanner = new Scanner(System.in);
				for(int i = 0; i < 2; i++)
				{
					System.out.println("Fruits First! \n"
							+"(select the number next to the topping to add it) \n"
							+ "1. Banana : $0.75\n"
							+ "2. Mixed Berries : $0.75 \n"
							+ "0. I am done with fruit toppings");
					
					System.out.println();
					int fruitInput = fruitScanner.nextInt();
					if(fruitInput == 1)
					{
						System.out.println("You selected Banana topping");
						fruitList.add("Banana");
						System.out.println();
					}
					else if (fruitInput == 2)
					{
						System.out.println("You selected Mixed Berried topping");
						fruitList.add("Mixed Berries");
						System.out.println();
					}
					else 
					{
						break;
					}
				}
				System.out.println("******************************");
				System.out.println("We are now done with adding fruit topppings. Let's add more! \n");
				Scanner confectioneryScanner = new Scanner(System.in);
				//confectionaires menu 
				for (int i = 0; i < 5; i++)
				{
					System.out.println("Confectioneries next! \n"
							+"(press the number next to the topping to add it) \n"
							+ "1. Caramel : $0.75 \n"
							+ "2. Coconut Shavings : $1.00 \n"
							+ "3. Colored Sprinkles: $0.75 \n"
							+ "4. Fudge : $1.25 \n"
							+ "5. Whipped Cream : $1.00 \n"
							+ "0. I am done with adding confectioneries.");
					System.out.println();
					int cInput = confectioneryScanner.nextInt();
					if (cInput == 1)
					{
						System.out.println("You selected Caramel");
						confectioneryList.add("Caramel");
						System.out.println();
					}
					else if(cInput == 2)
					{
						System.out.println("You selected Coconut Shavings!");
						confectioneryList.add("Coconut Shavings");
						System.out.println();
					}
					else if (cInput == 3)
					{
						System.out.println("You selected Colored Sprinkles.");
						confectioneryList.add("Colored Sprinkles");
						System.out.println();
					}
					else if (cInput == 4)
					{
						System.out.println("You selected Fudge");
						confectioneryList.add("Fudge");
						System.out.println();
					}
					else if (cInput == 5)
					{
						System.out.println("You selected Whipped Cream");
						confectioneryList.add("Whipped Cream");
						System.out.println();
					}
					else 
					{
						break;
					}
				} 
				System.out.println("******************************");
				System.out.println("We are done selecting Confectioneries \n");
			
				Scanner snacksScanner = new Scanner(System.in);
				for (int i=0; i < 4; i ++)
				{
					System.out.println("Lets add Snacks and Candies now! \n"
							+"(enter the number next to the topping to select it) \n"
							+ "1. Cookie Dough : $1.25 \n"
							+ "2. Gummi Bears : $0.75\n"
							+ "3. Oreos : $0.50 \n"
							+ "4. Reeses Cups : $0.75 \n"
							+ "0. I am done picking snacks and candies");
					System.out.println();
					int sInput = snacksScanner.nextInt();
					if (sInput == 1)
					{
						System.out.println("You selected Cookie Dough");
						snacksAndCandyList.add("Cookie Dough");
						System.out.println();
					}
					else if (sInput == 2)
					{
						System.out.println("You selected Gummi Bears!");
						snacksAndCandyList.add("Gummi Bears");
						System.out.println();
					}
					else if (sInput == 3)
					{
						System.out.println("You selected Oreos");
						snacksAndCandyList.add("Oreos");
						System.out.println();
					}
					else if (sInput == 4)
					{
						System.out.println("You selected Reeses Cups!");
						snacksAndCandyList.add("Reeses Cups");
						System.out.println();
					}
					else
					{
						break;
					}
				}
				System.out.println("Ok, we are done selecting toppings for your Ice Cream. \n");
				//add toppings to array lists
				String[] confectionery = new String[confectioneryList.size()];
				String[] fruit = new String[fruitList.size()];
				String[] snack = new String[snacksAndCandyList.size()];
				confectionery = confectioneryList.toArray(confectionery);
				fruit = fruitList.toArray(fruit);
				snack = snacksAndCandyList.toArray(snack);
				
				
				//send the info to the patissier and server
				IceCreamOrder iOrder = new IceCreamOrder(p, typeOfIceCream, fruit, confectionery, snack);
				s.takeOrder(iOrder);
			}
			//cremebrulee order
			else if (a==2)
			{
				String typeOfCremebrulee = null;
				String input = null;
				ArrayList<String> othersList = new ArrayList<>();
				ArrayList<String> cFruitList = new ArrayList<>();
				while(true)
				{
					System.out.println("******************************");
					System.out.println("What kind of Cremebrulee would you like? \n"
							+ "(S)alted Caramel : $5.50 \n"
							+ "S(n)ickerdoodle : $5.50 \n"
							+ "(V)anilla : $4.50");
					BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
					try
					{
						input = input1.readLine();
					}
					catch (IOException ioe)
					{
						ioe.printStackTrace();
					}
					if (input.equals("S") || input.equals("s"))
					{
						System.out.println("You selected Salted Caramel Cremebrulee \n");
						typeOfCremebrulee = "Salted Caramel";
						break;
					}
					else if(input.equals("n") || input.equals("N"))
					{
						System.out.println("You selected Snickerdoodle Cremebrulee");
						typeOfCremebrulee = "Snickerdoodle";
						break;
					}
					else if (input.equals("V") || input.equals("v"))
					{
						System.out.println("You selected Vanilla Cremebrulee");
						typeOfCremebrulee = "Vanilla";
						break;
					}
					else
					{
						continue;
					}
				}
				System.out.println("******************************");
				System.out.println("Let's add fruit toppings!!!! \n");
				Scanner cFScanner = new Scanner(System.in);
				for (int i = 0; i < 3; i++)
				{
					System.out.println("Here are our fruit toppings: \n"
							+ "(enter the number next to the topping to order)\n"
							+ "1. Banana : $0.50 \n"
							+ "2. Blueberry : $0.75 \n"
							+ "3. Strawberry : $1.00 \n"
							+ "(0) I am finished with fruit toppings.");
					int fruitChoice = cFScanner.nextInt();
					if(fruitChoice ==1)
					{
						System.out.println("You selected Banana \n");
						cFruitList.add("Banana");
					}
					else if (fruitChoice ==2)
					{
						System.out.println("You selected  Blueberry!");
						cFruitList.add("Blueberry");
					}
					else if (fruitChoice ==3)
					{
						System.out.println("You selected Strawberry");
						cFruitList.add("Strawberry");
					}
					else 
					{
						break;
					}
				}
				System.out.println("******************************");
				System.out.println("Done with fruit toppings on your Cremebrulee! \n");
				
				Scanner oScanner = new Scanner(System.in);
				for (int i = 0; i < 2; i++)
				{
					System.out.println("Time for some other toppings: \n"
							+ "1. Hard Caramel : $1.00 \n"
							+ "2. Vanilla Bean : $1.00 \n"
							+ "0. I am done with my toppings ");
					int otherChoice = oScanner.nextInt();
					if (otherChoice ==1)
					{
						System.out.println("You selected Hard Caramel \n");
						othersList.add("Hard Caramel");
					}
					else if (otherChoice == 2)
					{
						System.out.println("You selected Vanilla Bean! \n");
						othersList.add("Vanilla Bean");
					}
					else 
					{
						break;
					}
				}
				System.out.println("We are done selecting toppings now. \n");
				String[] cFruit = new String[cFruitList.size()];
				String[] cOther = new String[othersList.size()];
				cFruit = cFruitList.toArray(cFruit);
				cOther = othersList.toArray(cOther);
				CremebruleeOrder cOrder = new CremebruleeOrder(p, typeOfCremebrulee, cFruit, cOther);
				s.takeOrder(cOrder);
			}
			else if (a ==3)
			{
				Scanner drinkScanner = new Scanner(System.in);
				System.out.println("These are the drinks we offer");
				for (int i =0; i < 1; i++)
				{
					System.out.println("Flavours \n"
							+"(select the number next to a flavour to pick it) \n"
							+ "1. Apple Cider : $4.00 \n"
							+ "2. Aquafina : $1.00 \n"
							+ "3. CanadaDry : $ 1.00 \n"
							+ "4. Chai Tea : $2.50 \n"
							+ "5. Fiji Water : $3.00 \n"
							+ "6. Fruit Punch : $1.00 \n"
							+ "7. Gatorade : $2.00 \n"
							+ "8. CocaCola : $1.00 \n"
							+ "9. Hawaiian Punch : $1.00 \n"
							+ "10. Hot Chocolate : $3.00 \n"
							+ "11. Hot Cocoa : $4.00 \n"
							+ "12. Kool Aid : $2.00 \n"
							+ "13. Monster : $3.75 \n"
							+ "14. Pepsi : $1.00 \n"
							+ "15. Powerade : $2.00 \n"
							+ "16. Root Beer : $1.00 \n"
							+ "17. Sierra Mist : $1.00 \n"
							+ "18. Sprite : $1.00 \n"
							+ "19. Tea : $1.75 \n");
					int drinkChoice = drinkScanner.nextInt();
					if (drinkChoice == 1)
					{
						System.out.println("You selected Apple Cider \n");
						typeOfDrink = "Apple Cider";
					}
					else if (drinkChoice == 2)
					{
						System.out.println("You selected Aquafina \n");
						typeOfDrink = "Aquafina";
					}
					else if (drinkChoice == 3)
					{
						System.out.println("You selected Canada Dry \n");
						typeOfDrink = "Canada Dry";
					}
					else if (drinkChoice == 4)
					{
						System.out.println("You selected Chai Tea \n");
						typeOfDrink = "Chai Tea";
					}
					else if (drinkChoice == 5)
					{
						System.out.println("You selected Fiji Water \n");
						typeOfDrink = "Fiji Water";
					}
					else if (drinkChoice == 6)
					{
						System.out.println("You selected Fruit Punch \n");
						typeOfDrink = "Fruit Punch";
					}
					else if (drinkChoice == 7)
					{
						System.out.println("You selected Gatorade \n");
						typeOfDrink = "Gatorade";
					}
					else if (drinkChoice == 8)
					{
						System.out.println("You selected Coca Cola \n");
						typeOfDrink = "Coca Cola";
					}
					else if (drinkChoice == 9)
					{
						System.out.println("You selected Hawaiian Punch \n");
						typeOfDrink = "Hawaiian Punch";
					}
					else if (drinkChoice ==10)
					{
						System.out.println("You selected Hot Chocolate \n");
						typeOfDrink = "Hot Chocolate";
					}
					else if (drinkChoice == 11)
					{
						System.out.println("You selected Hot Cocoa \n");
						typeOfDrink = "Hot Cocoa";
					}
					else if (drinkChoice == 12)
					{
						System.out.println("You selected Kool Aid \n");
						typeOfDrink = "Kool Aid";
					}
					else if (drinkChoice == 13)
					{
						System.out.println("You selected Monster \n");
						typeOfDrink = "Monster";
					}
					else if (drinkChoice == 14)
					{
						System.out.println("You selected Pepsi \n");
						typeOfDrink = "Pepsi";
					}
					else if (drinkChoice == 15)
					{
						System.out.println("You selected Powerade \n");
						typeOfDrink = "Powerade";
					}
					else if (drinkChoice == 16)
					{
						System.out.println("You selected Root Beer \n");
						typeOfDrink = "Root Beer";
					}
					else if (drinkChoice == 17)
					{
						System.out.println("You selected Sierra Mist \n");
						typeOfDrink = "Sierra Mist";
					}
					else if (drinkChoice == 18)
					{
						System.out.println("You selected Sprite \n");
						typeOfDrink = "Sprite";
					}
					else if (drinkChoice == 19)
					{
						System.out.println("You selected Tea \n");
						typeOfDrink = "Tea";
					}
					else 
					{
						break;
					}
				}
				
				System.out.println("We are done selecting drinks now \n");
				DrinkOrder drinkOrder = new DrinkOrder(p, typeOfDrink);
				s.takeOrder(drinkOrder);
			}
			else
			{
				System.out.println("Thank you for shopping. Enjoy fam!");
				System.exit(0);
				break;
			}	
		}		
	}
}
