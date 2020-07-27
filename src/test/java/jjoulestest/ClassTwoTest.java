package jjoulestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.powerapi.junitjjoules.mesureit.MesureIt;

@MesureIt
class ClassTwoTest {
	
	private ClassTwo clazz = new ClassTwo("jjoules");
	
	@Test
	void testGetName() {
		assertEquals(this.clazz.getName(),"jjoules");
	}

	@Test
	void testFirstMethodSleepFor75ms() throws InterruptedException {
		this.clazz.firstMethodSleepFor75ms();
	}

	@Test
	void testSecondMethodSleepFor100ms() throws InterruptedException {
		this.clazz.secondMethodSleepFor100ms();
	}

}
