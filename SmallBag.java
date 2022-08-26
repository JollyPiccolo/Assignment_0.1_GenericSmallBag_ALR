/* Adeline Roberts
   FA2022 CS215
   SmallBag Class */

public class SmallBag<E>{
	
	//instantation
	private E thing;
	
	//construction - empty
	public SmallBag() {
	}
	
	//construction - full
	public SmallBag(E newThing) {
		this.thing = newThing;
	}
	
	//Accessor for SmallBag
	public E emptyBag() {
		return thing;
	}
	
	//Mutator for SmallBag
	public void fillBag(E newThing) {
		this.thing = newThing;
	}
}