/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import junit.framework.TestCase;

/**
 *
 * @author 312A-14
 */
public class PitagorasTest extends TestCase {
    
    public PitagorasTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of Calcular_Hipotenusa method, of class Pitagoras.
     */
    public void testCalcular_Hipotenusa() {
        System.out.println("Calcular_Hipotenusa");
        double ladoa = 3;
        double ladob = 4;
        double expResult = 5;
        double result = Pitagoras.Calcular_Hipotenusa(ladoa, ladob);
        assertEquals(expResult, result, 5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
