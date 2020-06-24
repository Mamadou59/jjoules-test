/**
 * 
 */
package test;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.jjoules.mesureIt.MesureIt;

/**
 * @author sanoussy
 *
 */
@MesureIt
class EnergyMesureExtensionTest {

	@Test
    void sleep25ms() throws Exception {
        Thread.sleep(25);
    }

    @Test
    void sleep50ms() throws Exception {
        Thread.sleep(50);
    }
    

}
