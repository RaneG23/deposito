import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testestaVacio {

	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(10);
		System.out.println(tank.estaVacio());
		tank.consumir(10);
		System.out.println(tank.estaVacio());
	}

}
