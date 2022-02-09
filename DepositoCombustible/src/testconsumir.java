import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testconsumir {

	@Test
	void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,35.0);
		tank.consumir(18.0);
		assertEquals(17.0,tank.getDepositoNivel());
	}

}
