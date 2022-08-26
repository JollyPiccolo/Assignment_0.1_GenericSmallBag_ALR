/* Adeline Roberts
   FA2022 CS215
   Application Class */

public class Application{
	
	public static void main(String[] args) {	
		
	//Instantation of String Item
	Item<String> test1 = new Item<String>();
	
	//Set item to Name
	test1.setItem("Adeline");
	
	//Instantation of Int Item
	Item<Integer> test2 = new Item<Integer>();
	
	//Set Item to int
	test2.setItem(14);

	//SmallBag Instantation
	SmallBag<Item> baggie = new SmallBag<Item>();

	//Baggie filling
	baggie.fillBag(test1);
	
	//Bag Print 1
	System.out.println(baggie.emptyBag());
	
	//Baggie filling 2
	baggie.fillBag(test2);
	
	//Bag Print 2
	System.out.println(baggie.emptyBag());
	
	}
}