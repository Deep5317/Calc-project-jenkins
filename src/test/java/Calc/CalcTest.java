

package Calc;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
import Calc.Calculator;
 
public class CalcTest {
 
    Calculator calc = new Calculator();
 
    @Test
    void testAdd() {
        assertEquals(15, calc.add(10,5));
    }
 
    @Test
    void testSub() {
        assertEquals(5, calc.sub(10,5));
    }
}