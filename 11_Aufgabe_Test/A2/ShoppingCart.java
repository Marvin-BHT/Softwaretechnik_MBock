package shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	public Map<String, Integer> warenkorb = new HashMap<>();
	public Map<String, Integer> warenmenge = new HashMap<>();
	
	public int getTotal() {
		int gesamt = 0;
		
		for (String name: warenkorb.keySet()) {
			gesamt += warenkorb.get(name)* warenmenge.get(name);
		}
		return gesamt;
	}
	
	public void addItem(String name, int preis) {
		if (preis <=0) {
			throw new IllegalArgumentException("Der Preis muss größer 0 sein");
		}
		
		warenkorb.put(name, preis);
		
		if (warenmenge.containsKey(name)) {
			warenmenge.put(name, warenmenge.get(name)+ 1);
		} else {
			warenmenge.put(name, 1);
		}
	}
	
	public int get_quantity(String name) {
		return warenmenge.getOrDefault(name, 0);
	}
	
	public void remove_item(String name) {
	
		int menge = warenmenge.get(name);
		
		if (menge > 1) {
			warenmenge.put(name, menge - 1);
		} else {
			warenmenge.remove(name);
			warenkorb.remove(name);
		}
		
	}
	

}
