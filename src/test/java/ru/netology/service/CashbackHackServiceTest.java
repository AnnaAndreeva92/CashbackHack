package ru.netology.service;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;

import static org.testng.Assert.*;

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

}