package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testWhenAmountLessBoundary1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenAmountLessBoundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWhenAmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}