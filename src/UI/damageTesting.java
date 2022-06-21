package UI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class damageTesting {

	@Test
	void test() {
		Damage obj = new Damage();

		obj.setCause("Damaged product");

		assertTrue(obj.getCause() == "Damaged product");
	}

}
