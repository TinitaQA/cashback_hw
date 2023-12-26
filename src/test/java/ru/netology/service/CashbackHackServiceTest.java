package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @Test
    public void testWhenAmountLessBoundary1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountLessBoundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountLessBoundary3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountLessBoundary4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testWhenAmountEqualsBoundary1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1_000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}