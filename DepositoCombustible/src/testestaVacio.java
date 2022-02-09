import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testestaVacio {

	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		tank.consumir(10);
		assertTrue(tank.estaVacio());
	}

}
