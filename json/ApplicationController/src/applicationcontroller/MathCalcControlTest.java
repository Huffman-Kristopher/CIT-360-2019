/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 *
 * @author Kristopher Huffman
 */
public class MathCalcControlTest {
    public MathCalcControlTest() {
    }

    /**
     * Test of calcVolumeTrianglePrism method, of class MathCalcControl.
     */
    @Test
    public void testCalcVolumeTrianglePrism() throws Exception {
        System.out.println("calcVolumeTrianglePrism");
        double base = 0.0;
        double length = 0.0;
        double height = 0.0;
        MathCalcControl instance = new MathCalcControl();
        double expResult = 1.0;
        double result = instance.calcVolumeTrianglePrism(base, length, height);
        assertTrue("The tested result was false", result > 1.0);
    }

    /**
     * Test of calcAreaTrapezoid method, of class MathCalcControl.
     */
    @Test
    public void testCalcAreaTrapezoid() throws Exception {
        System.out.println("calcAreaTrapezoid");
        double base1 = 0.0;
        double base2 = 0.0;
        double height = 0.0;
        MathCalcControl instance = new MathCalcControl();
        double expResult = 0.0;
        double result = instance.calcAreaTrapezoid(base1, base2, height);
        assertFalse("The tested result was true", result < 0.0);
    }

    /**
     * Test of calcDistanceTwoPoints method, of class MathControl.
     */
    @Test
    public void testCalcDistanceTwoPoints() throws Exception {
        System.out.println("calcDistanceTwoPoints Unit 1 Test");
        double x1 = 10.0;
        double x2 = 20.0;
        double y1 = 5.0;
        double y2 = 15.0;
        MathCalcControl instance = new MathCalcControl();
        double expResult = 14.14213562;
        double result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.00000001);
        
        System.out.println("calcDistanceTwoPoints Unit 2 Test");
        x1 = 10.0;
        x2 = 10.0;
        y1 = 10.0;
        y2 = 10.0;
        expResult = -1;
        result = instance.calcDistanceTwoPoints(x1, x2, y1, y2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testArrayEquals() throws Exception {
        System.out.println("testArrayEquals");
        int[] testArray1 = {1,2,3,4,5,6};       
        int[] testArray2 = {1,2,3,4,5,6};
        assertArrayEquals(testArray1, testArray2);
    } 
    
    @Test
    public void testAssertThat() throws Exception {
        System.out.println("testAssertThat");
        assertThat("testAssertThat",is("testAssertThat"));
    }
    
    @Test
    public void testAssertNotSame() throws Exception {
        String test1 = new String ("abc");
        String test2 = new String ("abc");
        String test3 = null;
        String test4 = "abc";
        String test5 = "abc";
        
        assertNull(test3);
        assertNotNull(test4);
        assertNotSame(test1,test3);
        assertSame(test4,test5); 
}
}
