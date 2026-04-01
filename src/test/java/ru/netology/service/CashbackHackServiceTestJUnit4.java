package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnit4 {

    @Test
    public void testRemainFor900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals("900 рублей: нужно докупить 100", 100, result);
        System.out.println("✓ JUnit4: Тест 900 пройден");
    }

    @Test
    public void testRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals("1000 рублей: докупать ничего не нужно", 0, result);
        System.out.println("✗ JUnit4: Тест 1000 должен упасть");
    }

    @Test
    public void testRemainFor500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(500);
        assertEquals("500 рублей: нужно докупить 500", 500, result);
        System.out.println("✓ JUnit4: Тест 500 пройден");
    }

    @Test
    public void testRemainFor999() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(999);
        assertEquals("999 рублей: нужно докупить 1", 1, result);
        System.out.println("✓ JUnit4: Тест 999 пройден");
    }

    @Test
    public void testRemainFor2000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(2000);
        assertEquals("2000 рублей: докупать ничего не нужно", 0, result);
        System.out.println("✗ JUnit4: Тест 2000 должен упасть");
    }

    @Test
    public void testRemainFor1900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1900);
        assertEquals("1900 рублей: нужно докупить 100", 100, result);
        System.out.println("✓ JUnit4: Тест 1900 пройден");
    }
}