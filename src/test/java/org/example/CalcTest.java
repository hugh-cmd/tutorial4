package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        c.add(4, c.add(2,2));
    }

void testSubtraction(){c.subtract(2, c.subtract(4,2));}
}
