package shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	public Map<String, Integer> warenkorb = new HashMap<>();
	
	public int getTotal() {
		int gesamt = 0;
		for (int preis: warenkorb.values()) {
			gesamt += preis;
		}
		return gesamt;
	}
	
	public void addItem(String name, int preis) {
		warenkorb.put(name, preis);
	}
}
