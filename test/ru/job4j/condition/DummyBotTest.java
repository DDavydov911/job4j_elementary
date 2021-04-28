package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenBuyBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Xa Xa";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }
}