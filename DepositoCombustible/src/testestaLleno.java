import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testestaLleno {

	@Test
	void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(40.0);
		assertEquals(true, tank.estaLleno());
	}

}
