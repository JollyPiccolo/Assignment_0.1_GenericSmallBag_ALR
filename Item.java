/* Adeline Roberts
   FA2022 CS215
   Item Class */

public class Item<T>{
	
	//Instantation
	private T e;
	
	//Constructor - Empty
	public Item() {
		e = null;
	}
	
	//Constructor - with data
	public Item(T newE) {
		this.e = newE;
	}
	
	public T getItem() {
		return e;
	}
	
	public void setItem(T newE) {
		this.e = newE;
	}
	
	public String toString() {
		String print = "  ";
		print += e.toString();
		return print;
	}
}