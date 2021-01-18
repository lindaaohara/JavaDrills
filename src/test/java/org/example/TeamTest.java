package org.example;

import org.junit.*;
import static java.util.Arrays.asList;


public class TeamTest {
    private static Team testTeam = new Team("Washington", "Mystics");

    static Iterable<Player>players;
    Player player1 = new Player("Elena Delle Donne", 11);
    Player player2 = new Player("Aerial Powers", 23);
    Player player3 = new Player("Emma Meesseman", 33);


@Before
public void setup(){
    players=asList(player1, player2);
    testTeam.setPlayers(players);
    player1.setSalary(221450);
    player2.setSalary(221450);
    player3.setSalary(221450);
    int maxNumberOfPlayers = 3;
    int salaryCap = 750000;
}

    @Test
    public void testGetName() {
        String expected = "Mystics";
        String actual = testTeam.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCity(){
        String expected = "Washington";
        String actual = testTeam.getCity();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetOpenSlots(){
    int expected =1;
    int actual = testTeam.getOpenSlots();
    Assert.assertEquals(expected, actual);
    }

//only passes when run alone; actual is doubled when run with all tests
    @Test
    public void testGetTotalSalaries(){
        int expected =442900;
        int actual = testTeam.getTotalSalaries(players);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAvailableFunds(){
        int expected =307100;
        int actual = testTeam.getAvailableFunds();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = OverMaxException.class)
    public void testCannotAddPlayer()throws Exception{
        testTeam.addPlayer(player3);
        Assert.assertTrue(true);

    }

    @Test
    public void testAddPlayer()throws Exception{
        testTeam.addPlayer(player3);
        int expected = 3;
        int actual = testTeam.getCountOfPlayers(players);
        Assert.assertEquals(expected, actual);

    }
 }

