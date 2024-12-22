package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testBoundaryValuesBelowLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual  = service.remain(999);

        assertEquals(actual,expected);
    }

    @Test
    public void testBoundaryValuesLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual  = service.remain(1000);

        assertEquals(actual,expected);

    }

    @Test
    public void testBoundaryValuesAboveLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual  = service.remain(1001);

        assertEquals(actual,expected);

    }

}