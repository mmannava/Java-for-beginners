import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Manasa on 3/24/2016.
 */
public class MathOperationsTest {

    @Test
    public void addTest(){
        assertEquals(15,new MathOperations().add(10,5));
        assertNotEquals(14,new MathOperations().add(10,5));
    }

    @Test
    public void subTest(){
        assertEquals(10, new MathOperations().sub(15,5));
        assertNotEquals(9, new MathOperations().sub(15,5));
    }

    @Test
    public void mulTest(){
        assertEquals(6, new MathOperations().mul(2,3));
        assertNotEquals(5, new MathOperations().mul(2, 3));
    }

    @Test
    public void divTest(){
        assertEquals(3, new MathOperations().div(6, 2));
        assertNotEquals(2, new MathOperations().div(6,1));
    }

}