package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShoppingCart_Test {

	@Test
	void test_empty_cart_has_zero_total() {
		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(0.0, cart.getTotal());
	}

}
