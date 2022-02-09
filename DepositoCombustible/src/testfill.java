import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testfill {

	@Test
	void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,7.0);
		tank.fill(17);
		assertEquals(24.0, tank.getDepositoNivel());
	}

}
