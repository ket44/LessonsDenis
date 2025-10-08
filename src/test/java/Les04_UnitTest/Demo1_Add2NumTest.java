package Les04_UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo1_Add2NumTest {
    @Test
    void addition() {
        assertEquals(2, Demo1_Add2Num.getSum2Number(1, 1));
    }
}