package Les04_UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo1_Add2NumTest {
    @Test
    void additionIntegerNums() {
        assertEquals(2, Demo1_Add2Num.getSum2Number(1, 1));
    }
    @Test
    void addBigIntegerNumTest(){
        assertEquals(4_000_000_000L,
                Demo1_Add2Num.getSum2Number(2_000_000_000, 2_000_000_000));
    }
}