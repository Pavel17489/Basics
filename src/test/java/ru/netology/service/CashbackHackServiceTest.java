package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testBoundaryValuesBelowLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual  = service.remain(999);

        assertEquals(expected,actual);
    }

    @Test
    public void testBoundaryValuesLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual  = service.remain(1000);

        assertEquals(expected,actual);

    }

    @Test
    public void testBoundaryValuesAboveLimit(){

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual  = service.remain(1001);

        assertEquals(expected,actual);

    }

}