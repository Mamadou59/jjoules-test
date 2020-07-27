package jjoulestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.powerapi.junitjjoules.mesureit.MesureIt;

@MesureIt
class ClassOneTest {
	
	private ClassOne clazz = new ClassOne(59);
	
	@Test
	void testFirstMethodSleepFor25ms() throws InterruptedException {
		this.clazz.firstMethodSleepFor25ms();
	}

	@Test
	void testSecondMethodSleepFor50ms() throws InterruptedException {
		this.clazz.secondMethodSleepFor50ms();
	}

	@Test
	void testGetX() {
		assertEquals(this.clazz.getX(),59);
	}

}
