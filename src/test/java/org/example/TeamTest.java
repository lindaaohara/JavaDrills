package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TeamTest {
    private static Team testTeam = new Team("Washington", "Mystics");
    static Integer maxNumberOfPlayers = 15;
    static Integer salaryCap = 109140000;

    @Test
    public void getName() {
        String expected = "Mystics";
        String actual = testTeam.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCity(){
        String expected = "Washington";
        String actual = testTeam.getCity();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = OverMaxException.class)
    public void testCannotAddPlayer throws Exception{

    }
}
