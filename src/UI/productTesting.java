package UI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class productTesting {

	@Test
	void test() {
		Product obj = new Product();

		obj.setName("Marker");

		assertTrue(obj.getName() == "Marker");
	}

}
