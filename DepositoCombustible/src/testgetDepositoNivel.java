import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testgetDepositoNivel {

	@Test
	void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,5.0);
		assertEquals(5.0, tank.getDepositoNivel());
	}

}
