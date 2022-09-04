package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateIfAmountCorrect() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int result = service.remain (amount);

        assertEquals(expected,result);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;
        int result = service.remain(amount);

        assertEquals(expected,result);
    }
    @Test
    public void shouldCalculateIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(expected, result);
    }
}