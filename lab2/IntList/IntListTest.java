package IntList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntListTest {
    @Test
    public void testPartA() {
        IntList lst1 = IntList.of(1, 2, 3);
        IntList lstResult = IntList.of(2, 3, 4);
        IntListExercises.addConstant(lst1, 1);
        assertEquals(lstResult.toString(), lst1.toString());
    }
}
