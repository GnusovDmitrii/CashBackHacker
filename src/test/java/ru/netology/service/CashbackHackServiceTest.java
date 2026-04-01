package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainFor900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(String.valueOf(result), 100, "900 рублей: нужно докупить 100");
        System.out.println("✓ Тест 900 пройден");
    }

    @Test
    public void testRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(String.valueOf(result), 0, "1000 рублей: докупать ничего не нужно");
        System.out.println("✗ Тест 1000 должен упасть");
    }

    @Test
    public void testRemainFor500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(500);
        Assert.assertEquals(String.valueOf(result), 500, "500 рублей: нужно докупить 500");
        System.out.println("✓ Тест 500 пройден");
    }

    @Test
    public void testRemainFor999() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(999);
        Assert.assertEquals(String.valueOf(result), 1, "999 рублей: нужно докупить 1");
        System.out.println("✓ Тест 999 пройден");
    }

    @Test
    public void testRemainFor2000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(2000);
        Assert.assertEquals(String.valueOf(result), 0, "2000 рублей: докупать ничего не нужно");
        System.out.println("✗ Тест 2000 должен упасть");
    }

    @Test
    public void testRemainFor1900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1900);
        Assert.assertEquals(String.valueOf(result), 100, "1900 рублей: нужно докупить 100");
        System.out.println("✓ Тест 1900 пройден");
    }
}