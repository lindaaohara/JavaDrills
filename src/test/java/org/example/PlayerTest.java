package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {
    private static Player testPlayer = new Player("Tariq", 1);

    Player player;
    @Mock
    Random random;

    @Before
    public void setup(){
        testPlayer.setPosition("Guard");
        testPlayer.setHeight(6.25);
        testPlayer.setSalary(25000000);
        testPlayer.setShootingAverage(.5);
    }

    @Test
    public void getName() {
        String expected = "Tariq";
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumber() {
        int expected = 1;
        int actual = testPlayer.getNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPosition() {
        String expected = "Guard";
        String actual = testPlayer.getPosition();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHeight() {
        Double expected = 6.25;
        Double actual = testPlayer.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getShootingAverage() {
        Double expected = 0.5;
        Double actual = testPlayer.getShootingAverage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSalary() {
        int expected = 25000000;
        int actual = testPlayer.getSalary();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShoot()throws Exception {
        when(random.nextDouble()).thenReturn(.3D);
        testPlayer.setRandom(this.random);
        testPlayer.getShootingAverage();
        testPlayer.shoot();
        int expected = 2;
        int actual =testPlayer.getPoints();
        Assert.assertEquals(expected, actual);
    }


    @Test(expected = MissedShotException.class)
    public void testMiss()throws Exception {
        when(random.nextDouble()).thenReturn(.8D);
        testPlayer.setRandom(this.random);
        testPlayer.getShootingAverage();
        testPlayer.shoot();
        Assert.assertTrue(true);
    }
}