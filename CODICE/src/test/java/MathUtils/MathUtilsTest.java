package MathUtils;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;



class MathUtilsTest {
	
	@Property
	void factorialZero(@ForAll int n) {
		n = 0;	    
	    int factorial = MathUtils.factorial(n);
	    Assertions.assertEquals(1, factorial, "Il fattoriale di 0 deve essere 1.");
	}
	
	@Property
	void IncrementingFactorial(@ForAll @IntRange(min = 1, max = 10) int n) {
	    long factorialN = MathUtils.factorial(n);
	    for (int i = 1; i <= n; i++) {
	        long factorialI = MathUtils.factorial(i);
	        Assertions.assertTrue(factorialN >= factorialI, "Il fattoriale di un numero deve essere maggiore o uguale al fattoriale dei numeri precedenti.");
	    }
	}
	   
    @Property
    void factorialPositive(@ForAll @IntRange(min = -15, max = 15) int n) {
         if (n < 0) {
            assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(n));
         } else {
        	 	assertTrue(MathUtils.factorial(n) > 0);
                }
    }
    
    
    @Property
    void pairResult(@ForAll @IntRange(min=2, max=100) int n) {
        assertTrue(MathUtils.factorial(n) % 2 == 0);
    }
    
    @Property
    void multiplesCheck(@ForAll @IntRange(min=1, max=100) int n) {
        int fact = MathUtils.factorial(n);
        boolean flag = true;
        for(int i=1; i == n; i++) {
            if(!(fact % i == 0)) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }
    
    @Property
    void factorialOneTest(@ForAll int n) {	
        n = 1;
        int expected = 1;
        int actual = MathUtils.factorial(n);
        assertEquals(expected, actual);
    }
     
}
