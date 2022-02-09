import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testgetDepositoMax {

	@Test
	void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        System.out.print(tank.getDepositoMax());
	}

}
